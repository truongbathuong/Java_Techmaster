package hackathon1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        File myFile = new File("E:\\buoihoc1\\javabasic\\javaproject\\src\\hackathon1\\nguyento.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap so tu ban phim( Nhap X hoac Q de thoat khoi chuong trinh)");
            String a = scanner.nextLine();
            if (a.equals("X") | a.equals("Q") | a.equals("x") | a.equals("q")) {
                break;
            } else if (a.matches(".*[^0-9].*")) {
                System.out.println(a + " khong phai la so ");
                fileWriter.write(a +" khong phai la so \n");
            } else {
                int b = Integer.valueOf(a);
                if(isPrimeNumber(b)){
                    System.out.println(b + " la so nguyen to");
                    fileWriter.write(a + " la so nguyen to\n" );
                } else{
                    System.out.println(b + " khong la so nguyen to");
                    fileWriter.write(b + " khong la so nguyen to\n");
                }
            }
        }
        fileWriter.close();
        scanner.close();
    }

    public static boolean isPrimeNumber (int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i<= sqrt;i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }
    
}
