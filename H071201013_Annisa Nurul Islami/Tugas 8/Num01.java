import java.io.*;
import java.util.Scanner;
 
public class Num01 {
  public static void main(String[] args) throws IOException {
    String s = new Scanner(System.in).nextLine();
    String d = new Scanner(System.in).nextLine();
       
    try {
      // File .txt saya simpan pada Local Disk E dalam folder File txt
      BufferedReader source = new BufferedReader(new FileReader("E:\\File txt\\" + s + ".txt"));
      BufferedWriter dest = new BufferedWriter(new FileWriter("E:\\File txt\\" + d + ".txt"));
      
      String text;

      while ((text = source.readLine()) != null) {
            dest.write(text);
            dest.newLine();
        }
        System.out.println("Berhasil");
        source.close();
        dest.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("Gagal");
    }  
  }
}