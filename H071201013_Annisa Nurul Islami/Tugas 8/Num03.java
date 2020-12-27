import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Num03 {
  public static void main(String[] args) {
    try {
      String file = new Scanner(System.in).nextLine();
      int sum = new Scanner(System.in).nextInt();

      ArrayList<String> name = new ArrayList<>();
      ArrayList<String> nim = new ArrayList<>();
      ArrayList<String> force = new ArrayList<>();

      // File .txt saya simpan pada Local Disk E dalam folder File txt
      BufferedWriter dest = new BufferedWriter(new FileWriter("E:\\File txt\\" + file + ".txt"));
      
      // Menginput data dan memasukkannya ke dalam objek ArrayList
      for (int i = 0; i < sum; i++) {
        name.add(new Scanner(System.in).nextLine());
        nim.add(new Scanner(System.in).nextLine());
        force.add(new Scanner(System.in).nextLine());
      }
      dest.write("+-----------------------+------------+----------+");
      dest.newLine();
      dest.write("| Nama                  | NIM        | Angkatan |");
      dest.newLine();
      dest.write("+-----------------------+------------+----------+");
      dest.newLine();

      for (int j = 0; j < sum; j++) {
        dest.write(String.format("| %-21s | %-10s | %-8s |", name.get(j), nim.get(j), force.get(j)));
        dest.newLine();
        dest.write("+-----------------------+------------+----------+");
        dest.newLine();
      }
      System.out.println("Berhasil");
      dest.close();
    }
    catch (IOException e) {
      System.out.println("Gagal");
    }
  }
}