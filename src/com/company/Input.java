package com.company;

import java.util.Scanner;

public class Input {
    private boolean done;
    private Scanner sc;
    private InputListener listener;

    public Input(InputListener listener) {
        done = false;
        sc = new Scanner(System.in);
        this.listener = listener;
    }

    public boolean isDone() {
        return done;
    }

    public void process(GameStatus state) {
        String in = sc.nextLine();
        done = "q".equals(in) || "quit".equals(in) || "выход".equals(in) || "Выход".equals(in);
        if (!done && this.listener != null) {
            if (state == GameStatus.Initialization){
                InitializationProcess(in);
            } else if (state == GameStatus.Doing){
                DoingProcess(in);
            }
        }
    }

    private void InitializationProcess(String in) {
        //формат инициализации корабликов
        //A-J; 1-10; h/v; 1-4;
        //F, 1, V, 1;
        String[] chunks = in.split(";");

        if (chunks.length >= 3) {

            String[] coords = chunks[0].split(",");
            int x = -1;
            int y = -1;

            if (coords.length >= 2) {
                char symbolIn = Character.toLowerCase(coords[0].charAt(0));
                x = symbolIn - 'a';
                y = Integer.parseInt(coords[1]);
            }

            int palubs = Integer.parseInt(chunks[2]);
            Orientation orientation = Orientation.None;

            if ("h".equals(chunks[1]) || "H".equals(chunks[1])) {
                orientation = Orientation.Horizontal;
            } else if ("v".equals(chunks[1]) || "V".equals(chunks[1])) {
                orientation = Orientation.Horizontal;
            }
            if (orientation != Orientation.None && x >= 0 && y >= 0) {
                this.listener.makeShip(x, y, palubs, orientation);
            }
        }
    }

    private void DoingProcess(String in){

    }
}

