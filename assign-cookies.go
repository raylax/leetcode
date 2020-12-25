func findContentChildren(g []int, s []int) int {
	sort.Ints(g)
	sort.Ints(s)
	c := 0
	for cookies := 0; c < len(g) && cookies < len(s); cookies++ {
		if g[c] <= s[cookies] {
			c++
		}
	}
	return c
}
