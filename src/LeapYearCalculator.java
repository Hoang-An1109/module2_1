// [Thực hành] Kiểm tra năm nhuận

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số năm: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận.");
                } else {
                    System.out.println("Năm " + year + " là năm không nhuận.");
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận.");
            }
        } else {
            System.out.println("Năm " + year + " là năm không nhuận.");
        }
    }
}
