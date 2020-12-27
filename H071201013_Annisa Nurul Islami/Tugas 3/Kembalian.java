import java.util.Scanner;

public class Kembalian 
{
    public static void main(String[] args)
    {
        System.out.println("~~~ Program Menghitung Kembalian ~~~");
        try
        {
            Scanner scan = new Scanner(System.in);
            //a=seratus, b=limapuluh, c=duapuluh, d=sepuluh, e=limaribu, f=duaribu, g=seribu
            int a=0, b=0, c=0, d=0, e=0, f=0, g=0;

            System.out.println("Harga barang :");
            int harga = scan.nextInt();
            System.out.println("Uang Anda:");
            int uang = scan.nextInt();

            if (harga < uang)
            {
                int kembalian = uang - harga;
                while (kembalian > 0)
                {
                    if (kembalian - 100000 >= 0)
                    {
                        kembalian -= 100000;
                        a++;
                    }
                    else if (kembalian - 50000 >= 0)
                    {
                        kembalian -= 50000;
                        b++;
                    }
                    else if (kembalian - 20000 >= 0)
                    {
                        kembalian -= 20000;
                        c++;
                    }
                    else if (kembalian - 10000 >= 0)
                    {
                        kembalian -= 10000;
                        d++;
                    }
                    else if (kembalian - 5000 >= 0)
                    {
                        kembalian -= 5000;
                        e++;
                    }
                    else if (kembalian - 2000 >= 0)
                    {
                        kembalian -= 2000;
                        f++;
                    }
                    else
                    {
                        kembalian -= 1000;
                        g++;
                    }
                }
                System.out.println(a + " uang Rp.100.000");
                System.out.println(b + " uang Rp.50.000");
                System.out.println(c + " uang Rp.20.000");
                System.out.println(d + " uang Rp.10.000");
                System.out.println(e + " uang Rp.5.000");
                System.out.println(f + " uang Rp.2.000");
                System.out.println(g +" uang Rp.1.000");
            }
            else if (harga > uang)
            {
                System.out.println("Uang Anda tidak cukup");
            }
            else {
                System.out.println("Tidak ada kembalian");
            }    
        }
        catch(Exception e)
        {
            System.out.println("Mohon masukkan data yang benar");
        }
    }
}
