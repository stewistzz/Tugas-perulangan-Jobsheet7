import java.util.Scanner;

public class WhileGaji08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String jabatan;


        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input08.nextInt();

        // int i = 0;
        // while (i < jumlahKaryawan) {
        //     System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        //     System.out.print("Masukkkan jabatan ke-" + (i+1) + ":");
        //     jabatan = input08.next();
        //     System.out.print("Masukkan jumlah jam lembur : ");
        //     jumlahJamLembur = input08.nextInt();
        //     i++;

        //     if (jabatan.equalsIgnoreCase("Direktur")) {
        //         continue;
        //     } else if (jabatan.equalsIgnoreCase("Manajer")) {
        //         gajiLembur = jumlahJamLembur * 100000;
        //     } else if (jabatan.equalsIgnoreCase("Karyawan")) {
        //         gajiLembur = jumlahJamLembur * 75000;
        //     } else {
        //         System.out.println("invalid");
        //     }
        //     totalGajiLembur += gajiLembur;
        // }

         int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkkan jabatan ke-" + (i+1) + ":");
            jabatan = input08.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = input08.nextInt();
            //  i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("invalid/jabatan yang anda masukkan tidak ada.");
                continue;
            }
            

            totalGajiLembur += gajiLembur;
            i++;
        }

        System.out.println("Total gaji lembur : " + totalGajiLembur);

    }
}
