class Solution {

    private var n = 0

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        fun dfs(rooms: List<List<Int>>, x: Int, visited: BooleanArray) {
            visited[x] = true
            n++
            rooms[x].forEach { if (!visited[it]) dfs(rooms, it, visited) }
        }
        dfs(rooms, 0, BooleanArray(rooms.size))
        return n == rooms.size
    }
}
