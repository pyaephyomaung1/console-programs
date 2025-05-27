package main

import "fmt"

func calculator() {
	var firstNumber, secondNumber int
	var operator string

	fmt.Print("Enter First Number: ")
	fmt.Scanln(&firstNumber)

	fmt.Print("Enter Second Number: ")
	fmt.Scanln(&secondNumber)

	fmt.Println("Choose Operator (+, -, *, /): ")
	fmt.Scanln(&operator)

	switch operator {
	case "+":
		fmt.Println("Result:", firstNumber+secondNumber)
	case "-":
		fmt.Println("Result:", firstNumber-secondNumber)
	case "*":
		fmt.Println("Result:", firstNumber*secondNumber)
	case "/":
		if secondNumber == 0 {
			fmt.Println("Error: Division by zero")
		} else {
			fmt.Println("Result:", firstNumber/secondNumber)
		}
	default:
		fmt.Println("Invalid operator.")
	}
}
