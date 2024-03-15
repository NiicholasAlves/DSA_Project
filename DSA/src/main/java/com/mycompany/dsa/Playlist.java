/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author nicho
 */
public interface Playlist {
    void addSong(Song song);
    void removeLastSong();
    void printPlaylist();
    int getNumberOfSongs();
    void moveSong(int fromIndex, int toIndex);
}
