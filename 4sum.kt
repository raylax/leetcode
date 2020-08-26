import java.util.*

class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if (nums.size < 4) return emptyList()
        nums.sort()
        println(nums.contentToString())
        val r: MutableList<List<Int>> = LinkedList()
        for (i in 0 until nums.size - 3) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue
            val n = i + 1
            for (j in n until nums.size - 2) {
                if (j > n && nums[j - 1] == nums[j])
                    continue
                var left = j + 1;
                var right = nums.size - 1;
                while (left < right) {
                    val x = target - nums[i] - nums[j] - nums[left] - nums[right]
                    when {
                        x == 0 -> {
                            println(listOf(i, j, left, right))
                            r.add(listOf(nums[i], nums[j], nums[left], nums[right]))
                            left++
                            right--
                            while (left < right && nums[left] == nums[left - 1])
                                left++
                            while (left < right && nums[right] == nums[right + 1])
                                right--
                        }
                        x > 0 -> left++
                        else -> right--
                    }
                }
            }
        }
        return r
    }
}
