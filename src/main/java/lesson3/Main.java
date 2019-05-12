package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Игорь");
        arr.add("Ольга");
        arr.add("Виктор");
        arr.add("Евгений");
        arr.add("Сергей");
        arr.add("Игорь");
        arr.add("Ольга");
        arr.add("Дарья");
        arr.add("Алексей");
        arr.add("Александр");


        for (int i = 0; i < arr.size() ; i++) {
            System.out.println("Элемент массива " + arr.get(i) + " повторяется " + Collections.frequency(arr,arr.get(i)) + " раз.");
        }
        System.out.println("Уникальные элементы массива: " + new HashSet<>(arr) );

        PhoneBook ph = new PhoneBook();
        ph.addSubscriber("Молодцов", 89216486584L);
        ph.addSubscriber("Сидоров", 89213458756L);
        ph.addSubscriber("Молодцов", 89213452756L);
        ph.getSubscriber("Сидоров");
        ph.getSubscriber("Иванов");

    }
}