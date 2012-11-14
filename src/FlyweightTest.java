

public class FlyweightTest {
    public static final int ROWS = 6, COLS = 10;

    public static void main(String[] args) {
        FlyweightButtonManager manager = new FlyweightButtonManager(ROWS);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                manager.getFlyweightButton(i).draw(j);
            }
        }
    }
}