package main

import "fmt"

func slice() {
	data := []string{"a", "b", "c", "d", "e", "f", "g"}

	slice1 := data[:3]
	fmt.Println(slice1)

	slice2 := data[:]
	fmt.Println(slice2)
}
