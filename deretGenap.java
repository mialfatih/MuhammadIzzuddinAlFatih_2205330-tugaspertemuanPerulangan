import java.util.Scanner;

public class deretGenap {
  public static void main(String[] args) {
      
      Scanner ngulangin = new Scanner(System.in);
      
      int awal = ngulangin.nextInt();
      
      int akhir = ngulangin.nextInt();
      
      int jumlahGenap = 0;
      
    for (int i = awal; i <= akhir; i++) {
      if (i % 2 == 0) { // Jika bilangan i adalah bilangan genap
                System.out.println(i);
                jumlahGenap++;
            }
    }
    System.out.println("Jumlah bilangan genap dari " + awal + " hingga " + akhir + " adalah: " + jumlahGenap);
  }
}