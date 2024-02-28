import java.util.Scanner;

public class FPB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();

        int hasil = hitung(a, b);

        System.out.println("Pembagi terbesar dari " + a + " dan " + b + " adalah : " + hasil);
    }

    public static int hitung(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}