// [Thực hành] Tính chỉ số cân nặng của cơ thể

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your weight (in kilogram):");
        double weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        double height = scanner.nextDouble();

        double bmi = weight / (Math.pow(height, 2));

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else {
            if (18.5 <= bmi && bmi < 25) {
                System.out.println("Normal");
            } else {
                if (25 <= bmi && bmi < 30) {
                    System.out.println("Overweight");
                } else {
                    System.out.println("Obese");
                }
            }
        }

    }
}
