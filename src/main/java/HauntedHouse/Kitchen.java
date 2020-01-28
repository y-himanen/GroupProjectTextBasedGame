package HauntedHouse;

import java.util.List;
import java.util.Scanner;

public class Kitchen extends Room {


    @Override
    public void introduceRoom() {
        System.out.println("You have entered the kitchen. You are greeted by the smell of something rotting.\n" +
                "There is a fridge quietly humming in the corner, a trash can, and an oven. Someone has left a pair of chopsticks lying around.\n" +
                "You wonder where those keys could be...");
    }

    public void takeThing() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What do you want to take?");
        String whatToTake = userInput.nextLine().toLowerCase().trim();
        switch (whatToTake) {
            case "apple":
                InventoryStuff.addToInventory("apple");
                System.out.println("The apple has been added to your inventory.");
                break;
            case "roast chicken":
                InventoryStuff.addToInventory("roast chicken");
                System.out.println("The roast chicken has been added to your inventory.");
                break;
            case "chopsticks":
                InventoryStuff.addToInventory("chopsticks");
                System.out.println("The chopsticks have been added to your inventory.");
                break;
            default:
                System.out.println("What are you doing? You can't take that.");
        }
        

    }
}