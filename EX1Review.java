// Ex1Review.java

/*
 * Title: Board Game Collection
 * Author: Ace Moom
 * Date: Feb 27, 2024
 */

import java.util.Scanner;
import java.util.ArrayList;

public class EX1Review {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<ArrayList<String>> Library = new ArrayList<ArrayList<String>>();

    // --- INPUTS ---

    /*
     * Prints out the menu & gets the user's choice
     * @return  (int)
     */
    
    public static int menu()    {
        System.out.println("""
            1. Enter a new game
            2. Edit a game
            3. See all games
         """);
         int choice = scanner.nextInt();
         scanner.nextLine(); //To consume the \n since nextInt won't
         return choice;
    }

    /*
     * Gets the name of the game to be entered from the user
     * @return  (String)
     */

    public static String getName()  {
        System.out.println("What is the name of your game?");
        String name = scanner.nextLine();
        return name;
    }

    /*
     * Gets the description of the game from the user
     * @return  (String)
     * 
     */

    public static String getDesc()  {
        System.out.println("Tell me about your game.");
        String desc = scanner.nextLine();
        return desc;
    }

    // --- PROCESSING ---
    /*
     * Gets the name of the game to be entered from the user
     * @return  (String)
     */

    public static void addGame(String name, String desc)    {
        ArrayList<String> game = new ArrayList<String>();
        game.add(name);
        game.add(desc);
        Library.add(game);
    }


    // --- OUTPUTS ---


    /*
     * Prints out all games in the Library with nice formatting
     * 
     */

    public static void displayGames()   {
        System.out.println("No. Name\tDescription");
        for(int i = 0; i < Library.size(); i++) {
            System.out.println(i+1 + ". " + Library.get(i).get(0) + "\t" + Library.get(i).get(1));

        }
        System.out.println();
    }

    public static void intro()  {
        System.out.println(""" 
            Welcome to my Game Library!
            What would you like to do?
        """);
    }

    public static void main(String[] args) throws Exception {
        intro();

        int choice;
        while (true) {
            choice = menu();
            if (choice == 1) {
                String name = getName();
                String desc = getDesc();
                addGame(name, desc);
            }
            
            else if (choice == 2) {
                System.out.println("This'll edit a game");
            }

            else if (choice == 3) {
                System.out.println("Library");
                displayGames();
            }

            else {
                System.out.println("Have a nice day!");
                break;
            }
        }
    }
}
