/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author nicho
 */
public class SongImpl implements Song {
    private String artist;
    private String title;
    private String genre;

    public SongImpl(String artist, String title, String genre) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return genre;
    }
}
