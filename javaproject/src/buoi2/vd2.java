package buoi2;

import java.util.Scanner;

public class vd2 {
    /**
     *
     */
    private static final int NOVEMBER = 11;
    /**
     *
     */
    private static final int SEPTEMBER = 9;
    /**
     *
     */
    private static final int JUNE = 6;
    /**
     *
     */
    private static final int APRIL = 4;
    /**
     *
     */
    private static final int FEBRUARY = 2;
    /**
     *
     */
    private static final int DECEMBER = 12;
    /**
     *
     */
    private static final int OCTOBER = 10;
    /**
     *
     */
    private static final int AUGUST = 8;
    /**
     *
     */
    private static final int JULY = 7;
    /**
     *
     */
    private static final int MAY = 5;
    /**
     *
     */
    private static final int MARCH = 3;
    /**
     *
     */
    private static final int JANNUARY = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        System.out.println("Nhap thang bat ky");
        month = scanner.nextInt();
        scanner.close();
        switch (month) {
            case JANNUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("Thang co 31 ngay");
                break;
            case FEBRUARY:
                System.out.println("Thang co 28 hoac 29 ngay");
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                System.out.println("Thang co 30 ngay");
                break;
            default: System.out.println("Nhap sai");

        }
    }

}
