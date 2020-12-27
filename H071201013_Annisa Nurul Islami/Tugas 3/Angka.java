import java.util.Scanner;

public class Angka
{
    public static void main(String[] args)
    {
        System.out.println("~~~ Program Pencetak Angka ~~~");
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan jumlah kolom yang ingin dicetak :");
            int x = scan.nextInt();
            System.out.println("Masukkan nilai sampai angka berapa yang ingin dicetak :");
            int y = scan.nextInt();

            if (x >= 1 && y >= 1) 
            {
                for (int z = 1; z <= y; z++) 
                {
                    if (z % x == 0) 
                    {
                        System.out.println(z);
                    }
                    else 
                    {
                        System.out.print(z + " ");
                    }
                }
            }
            else 
            {
                System.out.println("Masukkan data berupa bilangan bulat positif"); 
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println("Masukkan data yang benar");
        }
    }
}