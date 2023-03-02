package homeworks.hw_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task061 {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = getLaptopList();
        HashMap<Integer, String> sortingValues = getSortingMap();
        Scanner sc = new Scanner(System.in);

        int firstChoice = sortFirst(sortingValues, sc);

        System.out.println(firstChoice);

        for (Laptop el: laptops) el.getInfo();

        sc.close();
    }

    public static int sortSecond(HashMap<Integer, String> hm, Scanner sc) {
        return 1;
    }

    public static HashMap<String, ArrayList<String>> getStringChoices(HashMap<Integer, String> hm, ArrayList<Laptop> al) {
        HashMap<String, ArrayList<String>> strMap = new HashMap<>();

        
    }

    public static int sortFirst(HashMap<Integer, String> hm, Scanner sc) {
        System.out.println("Выберите цифру, соответствующую необходимому критерию:");
        for (var el: hm.entrySet()) System.out.println(el.getKey() + ". " + el.getValue());
        System.out.println();
        System.out.print("Ваш выбор:");
        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }

    public static HashMap<Integer, String> getSortingMap() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "ОЗУ");
        hm.put(2, "Объем ЖД");
        hm.put(3, "Операционная система");
        hm.put(4, "Цвет");

        return hm;
    }

    public static ArrayList<Laptop> getLaptopList() {
        ArrayList<Laptop> al = new ArrayList<>();
        Laptop testLaptop = new Laptop("Test Laptop", "White", 16, 512, "No OS");
        Laptop macbook = new Laptop("Apple MacBook Air 13\"", "Silver", 8, 256, "MacOS");
        Laptop irbis = new Laptop("IRBIS NB80", "Black", 2, 32, "Windows 10 Home");
        Laptop hpLaptop = new Laptop("hp 255 g9 5Y3X5EA", "Dark gray", 16, 512, "FreeDOS");
        Laptop acer = new Laptop("Ноутбук Acer Nitro 5", "Black", 16, 512, "DOS");

        al.add(acer);
        al.add(hpLaptop);
        al.add(irbis);
        al.add(macbook);
        al.add(testLaptop);

        return al;
    }
}
