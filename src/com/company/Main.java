package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map player1Map = new Map();
        Map player2Map = new Map();
        boolean done = false;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("       Игрок 1        ");
            player1Map.drawMap();
            System.out.println("       Игрок 2        ");
            player2Map.drawMap();
            int c = sc.nextInt();
            done = c == 0;
        } while (!done);

    }
}
