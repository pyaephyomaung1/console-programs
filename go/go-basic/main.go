package main

func main() {
	ch := make(chan int, 0)
	<-ch
	close(ch)
}
