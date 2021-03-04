package ex6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Dev dev1 = new Dev();
        // System.out.println("Lap trinh vien");
        // System.out.println("Nhap ma nhan vien : ");
        // int id1 = Integer.valueOf(scanner.nextLine());
        // dev1.setId(id1);
        // System.out.println("Nhap ho ten: ");
        // String name1 = scanner.nextLine();
        // dev1.setName(name1);
        // System.out.println("Nhap tuoi: ");
        // int age1 = Integer.valueOf(scanner.nextLine());
        // dev1.setAge(age1);
        // System.out.println("Nhap so dien thoai: ");
        // String phoneNum1 = scanner.nextLine();
        // dev1.setPhoneNum(phoneNum1);
        // System.out.println("Nhap email: ");
        // String email1 = scanner.nextLine();
        // dev1.setEmail(email1);
        // System.out.println("Nhap luong co ban");
        // int basicSalary1 = scanner.nextInt();
        // dev1.setBasicSalary(basicSalary1);
        // System.out.println("Nhap so gio lam them");
        // int overtime1 = scanner.nextInt();
        // dev1.setOvertime(overtime1);
        // int salaryDev1 = dev1.salaryDev();
        // System.out.printf("%2s %10s %3s %10s %10s %15s %3s %15s \n", "Id", "Hoten", "Tuoi", "SDT", "Email",
        //         "Luong co ban", "Gio lam them", "Luong nhan duoc");
        // System.out.printf("%2d %10s %3d %10s %10s %15d %3d %15d \n", id1, name1, age1, phoneNum1, email1, basicSalary1,
        //         overtime1, salaryDev1);
        // Tester tester1 = new Tester();
        // System.out.println("Kiem chung vien");
        // System.out.println("Nhap ma nhan vien : ");
        // int id2 = scanner.nextInt();
        // scanner.nextLine();
        // tester1.setId(id2);
        // System.out.println("Nhap ho ten: ");
        // String name2 = scanner.nextLine();
        // tester1.setName(name2);
        // System.out.println("Nhap tuoi: ");
        // int age2 = Integer.valueOf(scanner.nextLine());
        // tester1.setAge(age2);
        // System.out.println("Nhap so dien thoai: ");
        // String phoneNum2 = scanner.nextLine();
        // tester1.setPhoneNum(phoneNum2);
        // System.out.println("Nhap email: ");
        // String email2 = scanner.nextLine();
        // tester1.setEmail(email2);
        // System.out.println("Nhap luong co ban");
        // int basicSalary2 = scanner.nextInt();
        // tester1.setBasicSalary(basicSalary2);
        // System.out.println("Nhap so loi tim duoc");
        // int bug1 = scanner.nextInt();
        // tester1.setBug(bug1);
        // int salaryTester1 = tester1.salaryTester();
        // System.out.printf("%2s %10s %3s %10s %10s %15s %3s %15s \n", "Id", "Hoten", "Tuoi", "SDT", "Email",
        //         "Luong co ban", "So loi tim duoc", "Luong nhan duoc");
        // System.out.printf("%2d %10s %3d %10s %10s %15d %3d %15d \n", id2, name2, age2, phoneNum2, email2, basicSalary2,
        //         bug1, salaryTester1);

        // scanner.close();
        System.out.println("Nhap so nhan vien");
        int n = scanner.nextInt();
        Employee[] employee = new Employee[n];
        for (int i =0; i< n; i++){
            System.out.println("Chon loai nhan vien");
            System.out.println("Chon loai nhan vien \nChon 1: Lap trinh vien \nChon 2: Kiem chung vien");
            int choose = scanner.nextInt();
            if(choose == 1){
            System.out.println("Nhap thong tin lap trinh vien");
            employee[i] = new Dev();
            }
            else if (choose == 2){
                employee[i] = new Tester();
            }
            employee[i].input();
        }
        for (int i =0; i< n; i++){
            employee[i].display();
        }
        scanner.close();
    }
}
