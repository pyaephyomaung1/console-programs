package main

import "fmt"

func mapInGo() {
	var studentScores map[string]int
	fmt.Println(studentScores)
	fmt.Println(studentScores == nil)
	fmt.Println(len(studentScores))
}
