import java.util.Scanner;

public class DoWhileCuti08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Masukkan jatah cuti : ");
        jatahCuti = sc.nextInt();

        // perulangan do-while
        do {
            System.out.print("Apakah anda ingin mengambil cuti? (y/t)");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti " + jatahCuti + " hari");
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                    break;
                }

            }
        } while(jatahCuti > 0);

    }
}
