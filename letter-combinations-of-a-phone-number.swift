class Solution {
    private let charMap = [
        Character("2"): "abc",
        Character("3"): "def",
        Character("4"): "ghi",
        Character("5"): "jkl",
        Character("6"): "mno",
        Character("7"): "pqrs",
        Character("8"): "tuv",
        Character("9"): "wxyz",
    ]
    func letterCombinations(_ digits: String) -> [String] {
        if digits.count == 0 {
            return []
        }
        func inter(_ str: String, letter: String, index: Int) -> [String] {
            if index == str.count {
                return [letter]
            }
            let c = str[str.index(str.startIndex, offsetBy: index)]
            let cs = charMap[c]!
            var r: [String] = []
            for i in 0..<cs.count {
                r += inter(str, letter: letter + String(cs[cs.index(cs.startIndex, offsetBy: i)]), index: index+1)
            }
            return r
        }
        return inter(digits, letter: "", index: 0)
    }
}
