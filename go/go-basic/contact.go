package main

import (
	"bufio"
	"fmt"
	"strings"
)

type Contact struct {
	Name  string
	Phone string
	Email string
}

var contacts []Contact

func displayContact(c Contact) {
	fmt.Println("Name: ", c.Name)
	fmt.Println("Phone Number:", c.Phone)
	fmt.Println("Email: ", c.Email)
}

func addContact(reader *bufio.Reader) {
	fmt.Print("Enter Name: ")
	name, _ := reader.ReadString('\n')
	name = strings.TrimSpace(name)
	fmt.Println()
	fmt.Print("Enter Phone Number: ")
	phone, _ := reader.ReadString('\n')
	phone = strings.TrimSpace(phone)
	fmt.Println()
	fmt.Print("Enter Email: ")
	email, _ := reader.ReadString('\n')
	email = strings.TrimSpace(email)
	fmt.Sprintln()

	contacts = append(contacts, Contact{name, phone, email})
}

func viewContact() {
	if len(contacts) == 0 {
		fmt.Println("No Contact Here")
	}
	for _, contact := range contacts {
		displayContact(contact)
		fmt.Println("---------------------")
	}
}

func deleteContact() {

}
