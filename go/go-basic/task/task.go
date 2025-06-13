package main

import "fmt"

// Chapter 1
// task
// Quiz
// 1. short decalration is :=
// 2. 0
// 3. no, just withing function
// Reflect : in Java, string name = "John Doe" and in Php $name = "John Doe"
func task1(codename string, mission string) {
	fmt.Println("Chapter 1")
	fmt.Println("======================")
	fmt.Println("Agent ", codename)
	fmt.Println("Your mission is ", mission)
}

// Chapter 2
// Quiz
// 1. float64
// 2. compile error
// 3. global and local
// Reflect : I don't know, to preven code clarity
func task2() {
	var number int
	var double float64
	var text string
	var is_true bool

	fmt.Println("Chapter 2")
	fmt.Println("======================")
	fmt.Println("Int - ", number)
	fmt.Println("Float64 - ", double)
	fmt.Println("String -", text)
	fmt.Println("Bool - ", is_true)

	number = 9
	double = 3.14
	text = "Say My Name"
	is_true = true

	fmt.Println("======================")
	fmt.Println("Int - ", number)
	fmt.Println("Float64 - ", double)
	fmt.Println("String -", text)
	fmt.Println("Bool - ", is_true)
}

// Chapter 3
// Quiz
// 1. For for every loop
// 2.fallthrough
// 3.yes
func task3() {
	for i := 0; i <= 10; i++ {
		fmt.Println(i)
	}

	number := 12

	if number > 0 {
		fmt.Println("It is positive number")
	} else if number < 0 {
		fmt.Println("It is negative number")
	} else {
		fmt.Println("It's zero")
	}

	day := 5

	switch day {
	case '1':
		fmt.Println("It's Monday")
	case '2':
		fmt.Println("It's Tuesday")
	case '3':
		fmt.Println("It's Wednesday")
	case '4':
		fmt.Println("It's Thursday")
	case '5':
		fmt.Println("It's Friday")
	case '6':
		fmt.Println("It's Saturday")
	case '7':
		fmt.Println("It's Sunday")
	}
}

func task4() {
	languages := []string{"Java", "JavaScript", "Go", "Php"}
	newLanguages := append(languages, "Rust")
	fmt.Println("Original : ", languages)
	fmt.Println("New : ", newLanguages)

	countries := map[string]string{
		"Myanmar": "Naypyidaw",
		"England": "London",
		"Japan":   "Tokyo",
		"Germany": "Berlin",
	}

	for _, capital := range countries {
		fmt.Println("Capital Of ", )
	}
}
func main() {
	task1("Heisenberg", "Cooking Meth")
	task2()
	task3()
}
