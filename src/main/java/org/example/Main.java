package org.example;


import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> doors = new HashMap<>();
        doors.put(1, "Коза");
        doors.put(2, "Авто");
        doors.put(3, "Коза");
        Random initChoice = new Random();
        int win = 0;
        int fre = 0;
        for (int i = 0; i < 1000; i++) {

            if (doors.get(initChoice.nextInt(doors.size())) != "Коза"){
                win++;
            }
            else fre++;

        }
        System.out.println("Побед: " + win);
        System.out.println("Проигрыш: " + fre);
    }
}