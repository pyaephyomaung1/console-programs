package main

import "fmt"

func fibonacci() {
	n, n1, n2 := 10, 0, 1

	fmt.Print(n1, " ", n2)

	for i := 2; i < n; i++ {
		n3 := n1 + n2
		fmt.Print(" ", n3)
		n1 = n2
		n2 = n3
	}
}
