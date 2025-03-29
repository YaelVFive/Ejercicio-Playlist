package com.yaelvillanueva.ejercicioplaylist;

/**
 *
 * @author YAEL
 */
public class Canciones {

    //Atributos
    String author;
    String title;
    String album;
    String date;
    int time;

    //Metodos
    /*Primera forma
    public void Canciones(String _title, String _album, String _date, int _time) {
        title = _title;
        album = _album;
        date = _date;
        time = _time;
    }
     */
    //Segunda forma
    public Canciones(String author, String title, String album, String date, int time) {
        this.author = author;
        this.title = title;
        this.album = album;
        this.date = date;
        this.time = time;
    }

    public void showPlaylist() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Album: " + album);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}
