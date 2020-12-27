import java.util.Scanner;

public class Num02 {
    public static void main(String[] args) {
        Scanner kalimat = new Scanner(System.in);
        String kal = kalimat.nextLine();
        String kalBaru = new String();

        for (int x = 0; x < kal.length(); x++) {
            if (x % 2 == 0) {
                kalBaru += kal.charAt(x);
            }
            else {
                kalBaru += (int)(kal.charAt(x));
            }
        }
        int alpha = 0;
    
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < Math.ceil((double)kalBaru.length() / 16); z++) {
                    if (alpha < kalBaru.length()) {
                        System.out.print(kalBaru.charAt(alpha));
                        alpha++;
                    }
                    else {
                        System.out.print("?");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
