package ex14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class App {
    public static void printArray (List<? extends Person> list){
        for ( Person  s : list){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<Student>();
        list1.add(new Student("Long", "1", 24, "HN", 2));
        list1.add(new Student("Nam", "2", 24, "ND", 2.5));
        list1.add(new Student("Linh", "3", 24, "TB", 2.6));
        list1.add(new Student("Lam", "4", 24, "HP", 2.1));
        list1.add(new Student("Lien", "5", 24, "HN", 3));

        List<Teacher> list2 = new ArrayList<Teacher>();
        list2.add(new Teacher("Tu", "1", 30, "HN", 10000000));
        list2.add(new Teacher("Tuan", "2", 30, "HN", 11000000));
        list2.add(new Teacher("Tung", "3", 30, "HN", 13000000));
        list2.add(new Teacher("Tan", "4", 30, "HN", 15000000));
        list2.add(new Teacher("Tien", "5", 30, "HN", 12000000));

        System.out.println("Sap xep hoc sinh theo ten: ");
        Collections.sort(list1, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printArray(list1);

        System.out.println("Sap xep hoc sinh theo diem: ");
        Collections.sort(list1, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa()>o2.getGpa() ? 1 : -1;
            }
        });
        printArray(list1);

        System.out.println("Sap xep giao vien theo ten");
        Collections.sort(list2, new Comparator<Teacher>(){
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            };
        });
        printArray(list2);

        System.out.println("Sap xep giao vien theo luong");
        Collections.sort(list2, new Comparator<Teacher>(){
            @Override
            public int compare(Teacher o1, Teacher o2) {
               
                return o1.getSalary()>o2.getSalary()? 1 : -1;
            }
        });
        printArray(list2);
        System.out.println("Giao vien co luong cao nhat: " + list2.get(list2.size()-1));
        
        
    }
}
