// 执行用时：40 ms, 在所有 Swift 提交中击败了86.36%的用户
// 内存消耗：20.5 MB, 在所有 Swift 提交中击败了60.00%的用户
class Solution {
    func judgeCircle(_ moves: String) -> Bool {
        if moves.count & 1 == 1 {
            return false
        }
        var x = 0, y = 0
        for m in moves {
            switch m {
            case "L": x-=1
            case "R": x+=1
            case "U": y+=1
            case "D": y-=1
            default:
                break
            }
        }
        return x == 0 && y == 0
    }
}
