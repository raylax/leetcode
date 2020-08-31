/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {

    fun reverseList(head: ListNode?): ListNode? {
        val n = ListNode(0)
        fun reverse(head: ListNode?) {
            if (head == null) {
                return
            }
            val c = ListNode(head.`val`)
            c.next = n.next
            n.next = c
            reverse(head.next)
        }
        reverse(head)
        return n.next
    }


}
