package main

import "fmt"

func flow() {
	var number int
	fmt.Print("Enter Number: ")
	fmt.Scan(&number)
	if number%3 == 0 && number%5 == 0 {
		fmt.Print("FizzBuzz")
	} else if number%5 == 0 {
		fmt.Print("Buzz")
	} else if number%3 == 0 {
		fmt.Print("Fizz")
	} else {
		fmt.Println(number)
	}
}
