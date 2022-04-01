package com.infogalaxy;

import java.util.Random;

import static java.lang.Math.*;

public class SnakeandLadder {


            //UC-1 Player Start Game with Position 0:

        public void addPosition() {
            int position = 0;
            System.out.println("Player Position is " + position);
        }
        public void addDiceroll() {
            //UC-2 Rolling Dice to Get Number between 1-6:
            Random random = new Random();
            int dice = (int) ((Math.random()*(6-1))+1);
            System.out.println("Dice Number:" + dice);
    }

        public static void main(String args[]) {
            SnakeandLadder position = new SnakeandLadder();
            position.addPosition();
            position.addDiceroll();
    }

}


