import java.util.Scanner;

public class Waktu 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) 
        {
            float m = scan.nextFloat();
            if (m >= 0 && m < 360) {
                int detik = (int) (m * 240);
                int jam = (detik / 3600) + 6;
                int menit = (detik % 3600)  / 60;
                detik %= 60;

                if (jam >= 24) 
                {
                    jam -= 24;
                }
                if (jam <= 9) 
                {
                    System.out.println("Selamat Pagi!");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } 
                else if (jam <= 14) 
                {
                    System.out.println("Selamat Siang!");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } 
                else if (jam <= 18) 
                {
                    System.out.println("Selamat Sore!");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } 
                else 
                {
                    System.out.println("Selamat Malam!");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } 
            }
            else 
            {
                System.out.println("Masukkan data yang benar");
            }   
        }
    }
}
