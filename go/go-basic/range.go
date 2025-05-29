package main

import "fmt"

func rang() {
	names := []string{"Alice", "Bob", "Charlie"}
	for index, name := range names {
		fmt.Println("Index: ", index)
		fmt.Println("Name: ", name)
	}
}
