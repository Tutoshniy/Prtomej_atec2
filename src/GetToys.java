import java.io.*;
import java.util.*;

public class GetToys {
    public void Get (ArrayList<ToyConstructor> toys) {
        Random rnd = new Random();
        try (FileWriter fw = new FileWriter("Output.txt", true)) {
            int index = rnd.nextInt(toys.size()-1);
            fw.write(toys.get(index).getId() + " " + toys.get(index).getWeight() + '\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
