/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author nicho
 */
import java.util.ArrayList;
import java.util.List;

public class LikedPlaylist implements Playlist {
    private List<Song> songs;

    public LikedPlaylist() {
        songs = new ArrayList<>();
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public void removeLastSong() {
        if(!songs.isEmpty()){
        songs.remove(songs.size() -1);
        }
    }

    @Override
    public void printPlaylist() {
        System.out.println("Liked Playlist:");
        for (Song song : songs) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }

    @Override
    public int getNumberOfSongs() {
        return songs.size();
    }
    
    @Override
    public void moveSong(int fromIndex, int toIndex) {
        
        if (fromIndex < 0 || fromIndex >= songs.size() || toIndex < 0 || toIndex >= songs.size()) {
            System.out.println("Invalid indices");
            return;
        }

        
        Song songToMove = songs.remove(fromIndex);

        
        songs.add(toIndex, songToMove);
    }
}
