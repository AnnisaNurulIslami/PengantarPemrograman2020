import java.util.Scanner;

public class Num01 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        String word = w.nextLine();

        // spasi dihilangkan
        String noSpace = word.replaceAll("\\s", "");
        // semua huruf menjadi kapital
        String capital = noSpace.toUpperCase();

        // konversi ke hexadecimal
        int wordLength = word.length();
        int h = wordLength * wordLength;
        String hexa = String.format("%x", h);
        System.out.print("#" + hexa);

         // buat kata baru dari kata tanpa spasi
         char[] sentence = capital.toCharArray();
         for (int i = 0 ; i < (sentence.length/2) - 1; i++){
             char newWord = sentence[i];
             System.out.print(newWord);
         }
        
        // kata palindrom
        for (int i = (sentence.length/2) - 1; i >= 0; i--) {
            char palin = sentence[i];
            System.out.print(palin);
        }

        // konversi ke octal
        String octal = String.format("%o", wordLength);
        System.out.print(octal);

        // simbol ? atau !
        char symbol = String.valueOf(hexa).charAt(0);
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.print("?");
        }
        else {
            System.out.print("!");
        }
    }
}
