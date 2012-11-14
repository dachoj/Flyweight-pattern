

public class FlyweightButtonManager {
    private FlyweightButton[] pool;

    public FlyweightButtonManager(int maxRows) {
        pool = new FlyweightButton[maxRows];

    }

    public FlyweightButton getFlyweightButton(int col) {
        if (pool[col] == null) { //sprawdzamy czy Button już jest
            pool[col] = new FlyweightButton(col);// jak nie to tworzymy nowy
        }
        return pool[col];// i go zwracamy
    }

}