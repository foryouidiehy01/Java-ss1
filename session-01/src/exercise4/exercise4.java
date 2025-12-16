package exercise4;

public class exercise4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.printf("Giá trị a %d%n",a);
        System.out.printf("Giá trị b %d%n",b);
        System.out.printf("Tổng của a và b là :%d%n",sum);
        System.out.printf("Hiệu của a và b là :%d%n",diff);
        System.out.printf("Tích của a và b là :%d%n",product);
        System.out.printf("Thương của a và b là :%d%n",quotient);
        System.out.printf("Phần dư khi chia a cho b là :%d%n",remainder);
    }
}
