package main

import "fmt"

func binary(text string) {
	alphabets := []rune(text)
	for _, ch := range alphabets {
		ascii := int(ch)
		converter(ascii)
	}
}

func converter(number int) {
	for number == 0 {
		fmt.Print(0)
	}
	var result string
	for number > 0 {
		remainder := number % 2
		result = fmt.Sprintf("%d%s", remainder, result)
		number = number / 2
	}
	fmt.Print(result, " ")
}
