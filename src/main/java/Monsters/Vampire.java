package Monsters;

import Inventory.InventoryStuff;

public class Vampire implements Monster {
    @Override
    public void introduceMonster() {
        System.out.println("Oh no. You have found a vampire. The smell of death is overwhelming.\n" +
                "I sure hope he isn't hungry.\n" +
                "What are you going to do?");
    }

    @Override
    public void killHero() {
        System.out.println("Despite your best efforts, the vampire has decided to attack.\n" +
                "You lie bloodless on the floor.\n" +
                "Game over...for now.");
        System.exit(0);
    }

    @Override
    public void makeFriendsWithHero() {
        System.out.println("Good thinking. How did you know that the vampire was experimenting with veganism?\n" +
                "He's so happy that he has decided to give you his key.");
        InventoryStuff.addKey();
    }

    @Override
    public void monsterDies() {
        System.out.println("You resorted to violence, and it worked. A chopstick to the heart has slain the vampire.\n" +
                "You take the key from his cold corpse.");
        InventoryStuff.addKey();
    }
}
