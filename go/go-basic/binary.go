package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func binary() {
	fmt.Println("Enter a text or a word")
	reader := bufio.NewReader(os.Stdin)
	text, err := reader.ReadString('\n')
	if err != nil {
		fmt.Print("Error : ", err)
		return
	}
	text = strings.TrimSpace(text)
	if text == "" {
		fmt.Print("No Text or Word. Exiting ...")
		return 
	}
}
