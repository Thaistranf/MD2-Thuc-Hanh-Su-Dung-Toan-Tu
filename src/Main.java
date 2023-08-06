import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        int width = sc.nextInt();

        System.out.print("Nhập chiều cao: ");
        int height = sc.nextInt();

        int s = (width + height) * 2;
        System.out.println("Diện tích HCN = " + s);
    }
}