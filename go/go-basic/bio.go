package main

import "fmt"

const name = "Pyae Phyo Maung"
const studentId = 01
const favLanguage = "Go"

var year int = 2025
var isEnjoy bool = true
var intro string = "I am Pyae Phyo Maung. I am trying to be a skillful programmer."

func bio() {
	age := 22
	if age >= 18 {
		fmt.Print("You are an adult")
	} else if age > 12 {
		fmt.Print("You are a teenager")
	} else {
		fmt.Print("You are a kid")
	}
	fmt.Println("")
	fmt.Println("My name is ", name, ". I love ", favLanguage, ". Am I enjoying Go?", isEnjoy, ".")
	defer fmt.Print("Hello World")
}
