class Solution {
    func threeSum(_ nums: [Int]) -> [[Int]] {
        if nums.count < 3 {
            return []
        }
        var ns = nums
        ns.sort()
        var result: [[Int]] = []
        for i in 0..<ns.count {
            if i > 0 && ns[i] == ns[i-1] {
                continue
            }
            var left = i + 1, right = ns.count - 1
            while left < right {
                let x = ns[i] + ns[left] + ns[right]
                if x == 0 {
                    result.append([ns[i], ns[left], ns[right]])
                    right -= 1
                    left += 1
                    while left < right && ns[right] == ns[right + 1] {
                        right -= 1
                    }
                    while left < right && ns[left] == ns[left - 1] {
                        left += 1
                    }
                } else if x > 0 {
                    right -= 1
                } else {
                    left += 1
                }
            }
        }
        return result
    }
}
