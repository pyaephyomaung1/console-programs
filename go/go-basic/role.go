package main

import "fmt"

const (
	Admin = iota + 1
	Editor
	Viewer
)

func role() {
	var role int
	fmt.Print("Enter Role Number: ")
	fmt.Scan(&role)
	switch role {
	case Admin:
		fmt.Print("Access granted: Full admin privileges..")
	case Editor:
		fmt.Print("Access granted: You can edit content..")
	case Viewer:
		fmt.Print("Access granted: Read-only mode..")
	default:
		fmt.Print("Unknown role")
	}

}
