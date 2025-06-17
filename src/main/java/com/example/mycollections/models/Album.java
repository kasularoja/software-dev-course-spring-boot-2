package com.example.mycollections.models;

public class Album extends LibraryItem {
    private String artist;
    private int tracks;

    public Album(String name, String artist, int year, int tracks) {
        super(name, year);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {

        return artist;
    }

    public void setAuthor(String author) {

        this.artist = artist;
    }

    public int getTracks() {

        return tracks;
    }

    public void setTracks(int tracks) {

        this.tracks = tracks;
    }
}


