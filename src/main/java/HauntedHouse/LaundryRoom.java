package HauntedHouse;

public class LaundryRoom implements Room {

    @Override
    public void introduceRoom() {
        System.out.println("\nYou have entered the laundry room. A pair of scissors lies on top of a rusty broken washing machine.\n" +
                "A cabinet above the washing machine hangs slightly open. There seem to be some strange noises coming from the top-loading drier.\n" +
                "You venture forward in search of keys...");
    }
}
