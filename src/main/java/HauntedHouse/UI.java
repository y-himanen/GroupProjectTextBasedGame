package HauntedHouse;

import java.util.List;
import java.util.Scanner;

public class UI {

    /*Greeting/back-story, other text and descriptions.
     */
    Scanner userInput = new Scanner(System.in);

    public void startGame() {
        System.out.println("Good morning! Late night? How's your head? It seems like you had fun at yesterday's Academy after-work drinks....\n" +
                "But wait. Where are you? You look around and discover that you are in a dimly-lit narrow corridor.\n" +
                "There are several doors leading off the corridor, each with a sign above the door.\n" +
                "There seems to be a kitchen, storage room, basement, laundry room, and a door marked exit.\n" +
                "You go to the door marked exit. You rattle the handle violently, but the door doesn't budge. The door has four locks.\n" +
                "You wonder where the keys might be...\n");
        printCommandList();
        whatNext();
    }

    public void whatNext() {
        boolean cont = true;
        while(cont) {
            System.out.println("\nWhat do you want to do next?");
            System.out.print(">");
            String action = userInput.nextLine().trim().toLowerCase();

            switch (action) {
                case "quit":
                    cont = false;
                    System.out.println("Awww...too scary for you? Ok, bye for now.");
                    break;
                case "help":
                    printCommandList();
                    break;
                case "go":
                    System.out.println("Where do you want to go?");
                    String whereTo = userInput.nextLine().trim().toLowerCase();
                    switch (whereTo) {
                        case "kitchen":
                            Room kitchen = new Kitchen();
                            kitchen.setLocation("kitchen");
                            kitchen.introduceRoom();
                            //method here
                            break;
                        case "storage room":
                            Room storageRoom = new StorageRoom();
                            storageRoom.setLocation("storage room");
                            //method here
                            break;
                        case "basement":
                            Room basement = new Basement();
                            basement.setLocation("basement");
                            //method here
                            break;
                        case "laundry room":
                            Room laundryRoom = new LaundryRoom();
                            laundryRoom.setLocation("laundry room");
                            //method here
                            break;
                        case "corridor":
                            //method here - do we need to add a corridor?
                            break;
                        case "exit":
                            if (InventoryStuff.getNumberOfKeys() == 4) {
                                System.out.println("Well done! You're free! See you next Saturday...?");
                                System.exit(0);
                            }
                            else { System.out.println("You don't have enough keys to open the door. You're trapped."); }
                            break;
                        default:
                            System.out.println("You can't go there.");
                            break;

                    }
                    break;
                case "inventory":
                    InventoryStuff.printInventory();
                    break;

                case "take":
                    System.out.println("There's nothing to take.");
                    break;

                case "use":
                    System.out.println("You don't need to use anything here.");
                    break;


                case "open":
                    System.out.println("There's nothing to open here. Go to the exit when you have enough keys.");
                    break;

                default:
                    System.out.println("That's not a command. Are you still drunk? Please try again.");
                    break;
        }

        }

    }

        public static void printCommandList () {
            System.out.println("Available commands are:\n\nGo\nUse\nOpen\nTake\nInventory\nHelp (to see list again)\nQuit (to end game)");
            //whatNext();
        }
    }


