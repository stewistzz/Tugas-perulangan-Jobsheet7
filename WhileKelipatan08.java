import java.util.Scanner;

public class WhileKelipatan08 {
    public static void main(String[] args) {

        Scanner input08 = new Scanner(System.in);
        
        int kelipatan, counter = 0, total = 0;
        double rataRata;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input08.nextInt();
        
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }
        
        rataRata = (double) total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan adalah %.2f\n", rataRata);

    }
}
