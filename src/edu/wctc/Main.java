package edu.wctc;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char answer;
        Scanner keyboard = new Scanner(System.in);
        maze game = new maze();

        do {
            System.out.println(game.GetCurrentRoomDescription());
            System.out.println("Exits: " + game.GetCurrentRoomExits());

            answer = keyboard.nextLine().toLowerCase(Locale.ROOT).charAt(0);

            switch (answer) {
                case 'n':
                    if (game.move('n') == false) {
                        System.out.println("Cannot move here. Try again");
                    }
                    break;
                case 'e':
                    if (game.move('e') == false) {
                        System.out.println("Cannot move here. Try again");
                    }
                    break;

                case 's':
                    if (game.move('s') == false) {
                        System.out.println("Cannot move here. Try again");
                    }
                    break;

                case 'w':
                    if (game.move('w') == false) {
                        System.out.println("Cannot move here. Try again");
                    }
                    break;

                case 'u':
                    if (game.move('u') == false) {
                        System.out.println("Cannot move here. Try again");
                    }
                    break;

                case 'd':
                    if (game.move('d') == false) {
                        System.out.println("Cannot move here. Try again");
                    }
                    break;

                case 'v':
                    System.out.println(game.GetPlayerInventory());
                    break;
                case 'i':
                    System.out.println(game.InteractWithCurrentRoom());
                    break;
                case 'x':
                    String temp = game.ExitCurrentRoom();
                    System.out.println(temp);
                    if (temp.contains("tornado")) {
                        game.finish();
                    }
                    break;
                case 'l':
                    System.out.println(game.LootCurrentRoom());
                    break;
                default:
                    System.out.println("Try answer again");

            }
        } while (!game.isFinished());
        System.out.println(game.GetPlayerScore());
    }
}
