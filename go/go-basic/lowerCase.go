package main

func toLowerCase(text string) string {
	alphabets := []rune(text)
	var result string
	for _, ch := range alphabets {
		ascii := int(ch)
		if ascii >= 65 && ascii <= 90 {
			ascii += 32
		}
		result += string(rune(ascii))
	}
	return result
}
