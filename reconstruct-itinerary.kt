import java.util.*
import kotlin.collections.HashMap

class Solution {
    fun findItinerary(tickets: List<List<String>>): List<String> {
        val table: MutableMap<String, PriorityQueue<String>> = HashMap()
        val r: MutableList<String> = LinkedList()
        tickets.forEach { (from, to) -> table.computeIfAbsent(from) { PriorityQueue() }.add(to) }
        fun visit(table: MutableMap<String, PriorityQueue<String>>, src: String, r: MutableList<String>) {
            val n = table[src]
            while (n != null && n.size > 0) visit(table, n.poll(), r)
            r.add(0, src)
        }
        visit(table, "JFK", r)
        return r
    }
}
