package exercise3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn:");
        radius = input.nextDouble();
        area = Math.PI*radius * radius;
        System.out.printf("Diện tích hình tròn có bán kính %.2f là: %.2f%n",radius,area);
        input.close();
    }
}
