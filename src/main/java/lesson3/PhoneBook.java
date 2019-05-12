package lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    HashMap<String, HashSet<Long>> subscribers;

    PhoneBook() {
        subscribers = new HashMap<>();
    }

    public void addSubscriber(String name, Long phone) {

        if (subscribers.containsKey(name)) {
            subscribers.get(name).add(phone);
        } else {
            HashSet<Long> phoneList = new HashSet<>();
            phoneList.add(phone);
            subscribers.put(name, phoneList);
        }
    }

    public void getSubscriber(String name){

        if (subscribers.containsKey(name)) System.out.println("Ваш телефон " + subscribers.get(name));
            else {
            System.out.println("Такого телефона в базе данных нет");
        }
    }

}
