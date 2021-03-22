package ex13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void printArrayList(List<?extends Employee>lists){
        for (Employee s: lists){
            System.out.println(s.toString());
        }
    }
    public static void main(String[] args) {
        List<Waiter> list1 = new ArrayList<Waiter>();
        list1.add(new Waiter("1","Long",24,3000,200));
        list1.add(new Waiter("2","Dung",25,3000,200));
        printArrayList(list1);
        List<Kitchen> list2 = new ArrayList<Kitchen>();
        list2.add(new Kitchen("3", "Tu", 25, 2000, 100));
        list2.add(new Kitchen("4", "Tuan", 21, 2000, 200));
        printArrayList(list2);
    }
}
