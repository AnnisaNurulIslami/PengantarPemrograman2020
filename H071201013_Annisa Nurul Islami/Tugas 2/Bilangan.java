import java.util.Scanner;

class Bilangan {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int negative = 0; 
        int positive = 0;
        int even = 0;
        int odd = 0;
        
        try
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();

            if (a<=0)
            {
                if (a < 0)
                    negative++;
                if(a%2==0)
                    even++;
                else
                    odd++;            
            }
            else
            {
                    positive++;
                if(a%2==0)
                    even++;
                else
                    odd++;
            }

            if (b<=0)
            {
                if (b<0)
                    negative++;
                if(b%2==0)
                    even++;
                else
                    odd++;            
            }
            else
            {
                    positive++;
                if(b%2==0)
                    even++;
                else
                    odd++;
            }

            if (c<=0)
            {
                if (c<0)
                    negative++;
                if(c%2==0)
                    even++;
                else
                    odd++;            
            }
            else
            {
                    positive++;
                if(c%2==0)
                    even++;
                else
                    odd++;
            }

            if (d<=0)
            {
                if (d<0)
                    negative++;
                if(d%2==0)
                    even++;
                else
                    odd++;            
            }
            else
            {
                    positive++;
                if(d%2==0)
                    even++;
                else
                    odd++;
            }

            if (e<=0)
            {
                if (e<0)
                    negative++;
                if(e%2==0)
                    even++;
                else
                    odd++;            
            }
            else
            {
                positive++;
                if(e%2==0)
                    even++;
                else
                    odd++;
            }
        
            System.out.println(even + " Angka Genap");
            System.out.println(odd + " Angka Ganjil");
            System.out.println(positive + " Angka Positif");
            System.out.println(negative + " Angka Negatif");
            
        }          
        catch (Exception er) 
        {
            System.out.println("Inputan Tidak Valid");
        }
    }
}
