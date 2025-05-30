package main

func toUpperCase(text string) string {
	alphabets := []rune(text)
	var uppercase string
	for _, ch := range alphabets {
		ascii := int(ch)
		if ascii >= 97 && ascii <= 122 {
			ascii -= 32
		}
		uppercase += string(rune(ascii))
	}
	return uppercase
}
