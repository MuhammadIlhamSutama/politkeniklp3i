package com.example.politkeniklp3i;
public class NewsItem {
    private String imageUrl; // ubah dari int ke String
    private String title;
    private String date;


    public NewsItem(String imageUrl, String title, String date) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }
}

