import java.util.ArrayList;
import java.util.Scanner;

public class ToyCreator extends Exception {
    public ArrayList<ToyConstructor> Put()

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите игрушку, которую хотите добавить. Формат: id Название Вес");
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        if (data.length != 3) {
            throw new RuntimeException("Неправильный ввод данных");
        }
        int id;
        try {
            id = Integer.parseInt(data[0]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверный id");
        }
        String name = data[1];
        double weight;
        try {
            weight = Double.parseDouble(data[2]);
        } catch (RuntimeException e) {
            throw new RuntimeException("Неверный вес");
        }
        ToyConstructor toy = new ToyConstructor(id, name, weight);
        ArrayList<ToyConstructor> list = new ArrayList<>();
        for (int i = 0; i < weight; i++) {
            list.add(toy);
        }
        return list;
    }
}
