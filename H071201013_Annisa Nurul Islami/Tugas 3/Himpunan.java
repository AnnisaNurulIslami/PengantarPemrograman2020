import java.util.Scanner;

public class Himpunan 
{
    public static void main(String[] args)
    {
        System.out.println("~~~Program untuk mencetak elemen dalam suatu himpunan~~~");
        try
        {
            Scanner scan = new Scanner(System.in);
            int n, e1 = 0, e2 = 1;
            n = scan.nextInt();
            
            for (int bil = 0; bil < n; bil++)
            {
                System.out.print(e1 + " ");
                e1 += e2;
                e2 = e1 - e2;
            }
        }
        catch(Exception e)
        {
            System.out.println("Data harus bilangan bulat");
        }
    }
}
