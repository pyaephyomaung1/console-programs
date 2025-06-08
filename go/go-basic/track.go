package main

import (
	"fmt"
	"os"
)

func track() {
	// Create the file (or overwrite if exists)
	file, err := os.Create("insert_tracks.sql")
	if err != nil {
		fmt.Println("❌ Failed to create file:", err)
		return
	}
	defer file.Close()

	// Loop to generate 5 tracks per album (1–691)
	for albumID := 1; albumID <= 691; albumID++ {
		for i := 1; i <= 5; i++ {
			sql := fmt.Sprintf("INSERT INTO track (audio_file, title, album_id, artist_id, band_id) VALUES ('sample.mp3', 'Track %d of Album %d', %d, NULL, NULL);\n", i, albumID, albumID)
			_, err := file.WriteString(sql)
			if err != nil {
				fmt.Println("❌ Failed to write to file:", err)
				return
			}
		}
	}

	fmt.Println("✅ SQL insert file created: insert_tracks.sql")
}
