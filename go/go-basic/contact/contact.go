package main

import (
	"bufio"
	"fmt"
	"strings"
	"time"
)

type Contact struct {
	Name  string
	Phone string
	Email string
}

var contacts []Contact

func displayContacts(c Contact) {
	fmt.Println("Name : ", c.Name)
	fmt.Println("Phone : ", c.Phone)
	fmt.Println("Email : ", c.Email)
}

func addContacts(reader *bufio.Reader) {
	fmt.Print("Enter Name: ")
	name, _ := reader.ReadString('\n')
	name = strings.TrimSpace(name)
	fmt.Println("")
	fmt.Print("Enter Phone: ")
	phone, _ := reader.ReadString('\n')
	phone = strings.TrimSpace(phone)
	fmt.Println("")
	fmt.Print("Enter Email: ")
	email, _ := reader.ReadString('\n')
	email = strings.TrimSpace(email)
	contacts = append(contacts, Contact{name, phone, email})
}

func viewContacts() {
	if len(contacts) == 0 {
		fmt.Println("No contacts here")
	}
	fmt.Println("Contact Lists")
	for range 20 {
		fmt.Print("=")
	}
	fmt.Println("")
	for _, contact := range contacts {
		displayContacts(contact)
		for range 20 {
			fmt.Print("-")
		}
	}
	time.Sleep(250 * time.Millisecond)
}

func deleteContact(reader *bufio.Reader) {
	fmt.Println("Enter the name of contact you want to delete")
	name, _ := reader.ReadString('\n')
	name = strings.TrimSpace(name)
	index := -1 //common convention to mean "not found"

	for i, contact := range contacts {
		if strings.EqualFold(contact.Name, name) {
			index = i
			break
		}
	}

	if index == -1 {
		fmt.Println("Contact Not Found")
	} else {
		contacts = append(contacts[:index], contacts[index+1:]...)
	}
}
