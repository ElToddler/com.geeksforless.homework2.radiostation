package radiostation;

public class Song implements ContentActions {
    @Override
    public void play() {
        System.out.println("La-la-la");
}

    @Override
    public void saveToHDD() {
        System.out.println("Saved");

    }

    @Override
    public void countIncome() {
        System.out.println("1000");

    }
}
