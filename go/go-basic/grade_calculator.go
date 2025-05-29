package main

import "fmt"

func calculate() {
	var grade int
	fmt.Print("Enter Your Grade: ")
	fmt.Scanln(&grade)

	if 90 <= grade && grade <= 100 {
		fmt.Println("A")
	} else if 80 <= grade && grade <= 89 {
		fmt.Println("B")
	} else if 70 <= grade && grade <= 79 {
		fmt.Println("C")
	} else if 60 <= grade && grade <= 69 {
		fmt.Println("D")
	} else {
		fmt.Println("F")
	}
}
