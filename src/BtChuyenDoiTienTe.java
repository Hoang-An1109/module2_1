// Bài tập chuyển đổi tiền tệ

import java.util.Scanner;

public class BtChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double vnd=23000;
        double usd;


        System.out.print("Mời bạn nhập số tiền USD: ");
        usd=scanner.nextDouble();

        double tinh=usd*vnd;

        System.out.println("Giá trị VNĐ: "+tinh);
    }
}
