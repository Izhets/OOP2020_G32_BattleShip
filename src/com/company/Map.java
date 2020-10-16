package com.company;

public class Map {

    //Размеры поля
    public final int Width = 10;
    public final int Height = 10;

    //Ячейка
    private char[] title;
    private char[][] cells;

    public Map() {

        title = new char[Width];
        title = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        cells = new char[Width][Height];

        for (int y = 0; y < Height; ++y) {
            for (int x = 0; x < Width; ++x) {
                cells[x][y] = '*';
            }
        }
    }

    public void drawMap() {
        int coordX = 0;
        int coordY = 1;

        System.out.print(' ');
        for (int x = 0; x < Width; ++x) {
            System.out.print(' ');
            System.out.print(title [coordX++]);
        }

        System.out.println();

        for (int y = 0; y < Height; ++y) {
            System.out.print(coordY++);
            for (int x = 0; x < Width; ++x) {
                if ( !(x == 0 && coordY == 11)) {
                    System.out.print(' ');
                }
                System.out.print(cells[x][y]);
            }
            System.out.println('|');
        }
    }
}
