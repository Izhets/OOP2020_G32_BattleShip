package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NullPointerException {

        Map player1Map = new Map();
        Map player2Map = new Map();

        Input in = new Input(null);
        GameStatus gs = GameStatus.Initialization;

        do {
            System.out.println("       Игрок 1        ");
            player1Map.drawMap();
            System.out.println();
            System.out.println("       Игрок 2        ");
            player2Map.drawMap();
            in.process(gs);

        } while (!in.isDone());

    }
}
