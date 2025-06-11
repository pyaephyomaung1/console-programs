package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	for {
		fmt.Println(`
			Contact App
			(1) Add Contact
			(2) View Contact
			(3) Delete Contact
			(4) Exit
			`)
		fmt.Print("Enter your choice : ")
		choice, _ := reader.ReadString('\n')
		choice = strings.TrimSpace(choice)
		switch choice {
		case "1":
			addContacts(reader)
		case "2":
			viewContacts()
		case "3":
			deleteContact(reader)
		case "4":
			return
		default:
			fmt.Println("Wrong Format")
		}
	}
}
