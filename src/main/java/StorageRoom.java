import java.util.List;

public class StorageRoom extends Room {
    public StorageRoom(List<String> list) {
        super(list);
    }

    @Override
    public void introduceRoom() {
        System.out.println("You trip over a box and fall into a cluttered storage room.");
    }
}
