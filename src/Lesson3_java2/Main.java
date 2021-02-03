package Lesson3_java2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> carBrands = Arrays.asList
                (
                        "Nissan", "Mazda", "Seat", "Nissan", "Opel", "Volvo", "Nissan",
                        "Seat", "Nissan", "Opel", "Volkswagen", "Mazda", "Volvo", "Seat",
                        "Mazda", "SRT", "Saab", "Rover", "Scania", "Subaru"
                );
        Set<String> uniqueBrands = new HashSet<String>(carBrands);
        System.out.println(uniqueBrands);
        for (String key : uniqueBrands) {
            System.out.println(key + " " + Collections.frequency(carBrands, key));

        }
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров", "+79123456789");
        phoneBook.add("Петров", "+79123456781");
        phoneBook.add("Петрова", "+79123456782");
        phoneBook.add("Иванов", "+79123456783");
        phoneBook.add("Сергеев", "+79123456784");

        phoneBook.info();
        System.out.println("Петров" + phoneBook.get("Петров"));

    }


}
