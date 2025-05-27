package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func reverse() {
	fmt.Print("Enter a text or a word: ")
	reader := bufio.NewReader(os.Stdin)
	text, err := reader.ReadString('\n')
	if err != nil {
		fmt.Print("Error ", err)
		return
	}
	text = strings.TrimSpace(text)

	runes := []rune(text)

	reverseRune := make([]rune, len(runes))

	length := len(runes)

	for i := length - 1; i >= 0; i-- {
		reverseRune[length-1-i] = runes[i]
	}

	reverseText := string(reverseRune)
	fmt.Println(reverseText)
}
