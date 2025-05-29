package main

import (
	"fmt"
	"strconv"
)

func ParseAndAdd(s1, s2 string) (int, error) {
	num1, err1 := strconv.Atoi(s1)
	if err1 != nil {
		return 0, fmt.Errorf("Error Parsing", num1)
	}

	num2, err2 := strconv.Atoi(s2)
	if err2 != nil {
		return 0, fmt.Errorf("Error Parsing", num2)
	}
	return num1 + num2, nil
}
