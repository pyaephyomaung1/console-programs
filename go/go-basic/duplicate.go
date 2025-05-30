package main

import "fmt"

func duplicate() {
	original := []int{10, 20, 30}

	duplicate := make([]int, len(original))

	copy(duplicate, original)
	fmt.Println(duplicate)
	duplicate[0] = 99
	fmt.Println("Modified ", duplicate)
	fmt.Println("Original ", original)
}
