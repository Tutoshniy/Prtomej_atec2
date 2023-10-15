import java.util.ArrayList;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        ArrayList<ToyConstructor> toy1 = new ToyCreator().Put();
        ArrayList<ToyConstructor> toy2 = new ToyCreator().Put();
        ArrayList<ToyConstructor> toy3 = new ToyCreator().Put();

        PriorityQueue<ToyConstructor> toys = new PriorityQueue<>();
        toys.addAll(toy1);
        toys.addAll(toy2);
        toys.addAll(toy3);

        ArrayList<ToyConstructor> listToys = new ArrayList<>(toys);

        GetToys GToys = new GetToys();

        for(int i = 0; i <= 10; i++) {
            GToys.Get(listToys);
        }

    }
}
