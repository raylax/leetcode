
import kotlin.math.max

class Solution {
    fun PredictTheWinner(nums: IntArray): Boolean {
        fun pick(i: Int, j: Int): Int {
            return if (i == j) nums[i] else max(nums[i] - pick(i + 1, j), nums[j] - pick(i, j - 1))
        }
        return pick(0, nums.lastIndex) > 0
    }
}
