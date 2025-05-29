package main

import (
	"fmt"
	"time"
)

func student() {
	name := "John Doe"
	age := 20
	gpa := 3.85
	isEnrolled := true
	birthDate := time.Now().Year() - age

	fmt.Println("Student Profile:")
	fmt.Println("Name:", name)
	fmt.Println("Age:", age)
	fmt.Println("GPA:", gpa)
	fmt.Println("Enrolled:", isEnrolled)
	fmt.Println("Birth Year:", birthDate)
}
