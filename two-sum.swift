class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var idx: [Int:Int] = [:]
        for (i, n) in nums.enumerated() {
            let x = target - n
            if idx[x] != nil {
                return [n, idx[x]!]
            }
            idx[n] = i
        }
        return []
    }
}

