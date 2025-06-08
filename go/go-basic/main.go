package main

import (
	"fmt"
	"sort"
)

func main() {
	numbers := []int{5, 3, 2, 12, 3, 5, -19, -20}
	sort.Ints(numbers)
	fmt.Println(numbers)
}
