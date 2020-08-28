// 执行用时： 4 ms, 在所有 Go 提交中击败了 92.22% 的用户
// 内存消耗： 3.5 MB, 在所有 Go 提交中击败了 100.00% 的用户
func judgeCircle(moves string) bool {
	if len(moves) == 0 || len(moves) & 1 == 1 {
		return false
	}
	var x int8
	var y int8
	for _, c := range moves {
		switch c {
		case 'L': x--
		case 'R': x++
		case 'U': y++
		case 'D': y--
		}
	}
	return x == 0 && y == 0
}

