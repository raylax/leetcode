class Solution {
    fun shortestPalindrome(s: String): String {
        val reversed = s.reversed()
        for (i in 0 .. s.length) {
            val prefix = reversed.substring(i)
            if (s.startsWith(prefix)) {
                return prefix + s
            }
        }
        return ""
    }
}
