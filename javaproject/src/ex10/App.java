package ex10;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<Employee>();
        for (int i =0; i < 3; i++){
            Employee employee = new Employee();
            employee.input();
            arr.add(employee);
        }
        for(Employee employee: arr){
            System.out.println(employee);
        }
        System.out.println("Nhap vi tri can them");
        int n = Integer.valueOf(sc.nextLine());
        Employee employeeAdd = new Employee();
        employeeAdd.input();
        arr.add(n,employeeAdd);
        System.out.println("Danh sach nhan vien sau khi them: ");
        for(Employee employee: arr){
            System.out.println(employee);
        }
        System.out.println("Nhap ten nhan vien can xoa:");
        String deleteName = sc.nextLine();
        System.out.println("Nhap ma nhan vien can xoa");
        int deleteId = Integer.valueOf(sc.nextLine());
        for(int i =0; i < arr.size();i++){
            if(arr.get(i).getName().equals(deleteName) && arr.get(i).getId()==deleteId){
                arr.remove(i);
            }
        }
        System.out.println("Danh sach nhan vien sau khi xoa:");
        for(Employee employee: arr){
            System.out.println(employee);
        }
        System.out.println("Nhap ten nhan vien can sua:");
        String rename = sc.nextLine();
        System.out.println("Nhap ten moi: ");
        String newName = sc.nextLine();
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i).getName().equals(rename)){
            arr.get(i).setName(newName);
            }
        }
        for(Employee employee: arr){
            System.out.println(employee);
        }
        File myFile = new File("E:\\buoihoc1\\javabasic\\javaproject\\src\\ex10\\Test.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile);
        for(Employee employee : arr){
            fileWriter.write(employee.toString());
        }
        sc.close();
        fileWriter.close();
    }
}
