package hackathon1;
import java.util.Scanner;
import java.util.ArrayList;
public class App{
    public static void main(String[] args) {
        System.out.println(
                "Nhap 1 de chon doi hinh 4-3-3 \nNhap 2 de chon doi hinh 4-4-2 \nNhap 3 de chon doi hinh 3-5-2 \n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int a = 0, b = 0, c = 0;
        switch (n) {
        case 1:
            a = 4;
            b = 3;
            c = 3;
            break;
        case 2:
            a = 4;
            b = 4;
            c = 2;
            break;
        case 3:
            a = 3;
            b = 5;
            c = 2;
            break;
        default:
            break;
        }
        Team team = new Team();
        ArrayList<Player> list = team.buildTeam(a, b, c);
        for (Player player : list) {
            System.out.println(player.toString());
        }
    }
}
