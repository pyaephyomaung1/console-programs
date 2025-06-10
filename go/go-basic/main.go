package main

import (
	"fmt"
	"time"
)

func main() {
	ch := make(chan string)
	quit := make(chan bool)

	go func() {
		for i := 0; i < 3; i++ {
			ch <- fmt.Sprintf("Gopher 1 say hi %d", i)
			time.Sleep(500 * time.Millisecond)
		}
	}()

	go func() {
		for i := 0; i < 3; i++ {
			ch <- fmt.Sprintf("Gopher 2 say hi %d", i)
			time.Sleep(700 * time.Millisecond)
		}
		quit <- true
	}()

	for {
		select {
		case msg := <-ch:
			fmt.Println("Message", msg)
		case <-quit:
			fmt.Println("Quitting")
			return
		}
	}
}
