package main

import "errors"

func performOperation(operation string, a, b float64) (float64, error) {
	switch operation {
	case "add":
		return a + b, nil
	case "substract":
		return a - b, nil
	case "multiply":
		return a * b, nil
	case "divide":
		if b == 0 {
			return 0, errors.New("Division by zero")
		}
		return a / b, nil
	default:
		return 0, errors.New("unsupported operation " + operation)
	}
}
