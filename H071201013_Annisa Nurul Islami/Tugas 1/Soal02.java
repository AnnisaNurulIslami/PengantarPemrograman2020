import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner waktu = new Scanner (System.in);

        System.out.println("~~~~~ Nama/NIM : Annisa Nurul Islami/H071201013 ~~~~~");
        System.out.println("=== Program Konversi Detik Ke Format Jam : Menit : Detik ==="); {
            System.out.println("Masukkan detik :");
            int nilaiDetik = waktu.nextInt();

            int jam =  nilaiDetik / 3600;
            int menit = (nilaiDetik % 3600)  / 60;
            int detik = nilaiDetik % 60;
    
            System.out.printf("%02d : %02d : %02d", jam, menit, detik);
        }
        waktu.close();
    }
}