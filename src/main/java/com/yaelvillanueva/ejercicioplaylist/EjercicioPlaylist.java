package com.yaelvillanueva.ejercicioplaylist;

/**
 *
 * @author YAEL
 */
public class EjercicioPlaylist {

    public static void main(String[] args) {
        Canciones pl1 = new Canciones("Daft punk", "Get lucky", "Random access memories", "2013", 6);
        pl1.showPlaylist();

        System.out.println("\n");
        Canciones pl2 = new Canciones("Tame Impala", "Let it happen", "Currents", "2015", 4);
        pl2.showPlaylist();

        System.out.println("\n");
        Canciones pl3 = new Canciones("Madonna", "La isla bonita", "True blue", "1986", 4);
        pl3.showPlaylist();
    }
}
