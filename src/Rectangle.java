// [Thực hành] Sử dụng toán tử;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float height;
        float weight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        System.out.println("Enter weight: ");
        weight = scanner.nextFloat();

        float area = height * weight;

        System.out.println("Area is: " + area);

    }
}
