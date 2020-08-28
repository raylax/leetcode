
/**
 * 执行用时：292 ms, 在所有 Kotlin 提交中击败了16.67%的用户
 * 内存消耗：34.6 MB, 在所有 Kotlin 提交中击败了33.33%的用户
 */
class Solution {
    fun judgeCircle(moves: String): Boolean {
        return if (moves.length and 1 == 1) false else {
            var x = 0
            var y = 0
            moves.forEach { when (it) {
                'L' -> x--
                'R' -> x++
                'U' -> y++
                'D' -> y--
            } }
            return x == 0 && y == 0
        }
    }
}

