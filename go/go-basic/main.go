package main

import "fmt"

type Person struct {
	Name string
	Age  int
}

type Agent struct {
	Person
	Codename     string
	MissionCount int
}

type Undercover struct {
	Agent
	Alias string
}

type FieldAgent struct {
	Agent
	Weapon string
}

type Operative interface {
	Report()
}

func (u Undercover) Report() {
	fmt.Println("Undercover Agent :", u.Codename, "A.k.a ", u.Alias, " - Missions :", u.MissionCount)
}

func (a FieldAgent) Report() {
	fmt.Println("Field Agent :", a.Codename, "wields ", a.Weapon, " - Missions :", a.MissionCount)
}

func Identify(o Operative){
	
}
