import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class FavMovie {
    public static List<String> judul = new ArrayList<String>();
    public static List<String> rilis = new ArrayList<String>();
    public static List<String> durasi = new ArrayList<String>();
    public static List<String> genre = new ArrayList<String>();
    public static List<String> sinopsis = new ArrayList<String>();
    public static List<String> cast = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        judul.add("Doctor Strange");
        rilis.add("26 Oktober 2016");
        genre.add("Superhero, Action");
        sinopsis.add("Ini adalah sinopsis");
        durasi.add("2 jam 35 menit");
        cast.add("Benedict Cumberbatch, Rachel McAdams, Benedict Wong");

        judul.add("Black Panther");
        rilis.add("14 Februari 2018");
        genre.add("Superhero, Action");
        sinopsis.add("Ini adalah sinopsis");
        durasi.add("2 jam 14 menit");
        cast.add("Chadwick Boseman, Michael B. Jordan, Martin Freeman");

        judul.add("Venom");
        rilis.add("3 Oktober 2018");
        genre.add("Science Fiction, Action, Horror");
        sinopsis.add("Ini adalah sinopsis");
        durasi.add("2 jam 20 menit");
        cast.add("Woody Harrelson, Tom Hardy, Michelle William");

        judul.add("Deadpool");
        rilis.add("10 Februari 2016");
        genre.add("Superhero, Comedy");
        sinopsis.add("Ini adalah sinopsis");
        durasi.add("2 jam 12 menit");
        cast.add("Ryan Reynolds, Morena Baccarin, T.J Miller");
        Show();
        System.out.print("> ");

        while (scan.hasNext()) {
            char select = scan.next().charAt(0);
            switch (select) {
                case 'r':
                    int num1 = scan.nextInt();
                    Remove(num1);
                    Show();
                    break;
                case 's':
                    String film = scan.next();
                    Search(film);
                    break;
                case 'd':
                    int num2 = scan.nextInt();
                    Detail(num2);
                    break;
                case 'a':
                    System.out.print("Judul\t :");
                    Adding();
                    break;
            }
            System.out.print("> ");
        }
    }
    public static void Show() {
        for (int x = 0; x < judul.size(); x++) {
            System.out.println(x + 1 + ". " + judul.get(x));
        } 
        System.out.println("d(Detail)\t s(Search)\t a(Add)\t r(Remove)\t  ctrl+c(Cancel)");
    }
    public static void Remove(int x) {
        judul.remove(x - 1);
        for (int y = 0; y < judul.size(); y++) {
            System.out.println(judul.get(y));
        }
        System.out.println("d(Detail)\t s(Search)\t a(Add)\t r(Remove)\t  ctrl+c(Cancel)");
    }
    public static void Search(String x) {
        for (int y = 0; y < judul.size(); y++) {
            if (judul.get(y).contains(x)) {
                System.out.println(y + 1 + ". " + judul.get(y));
            }
        } 
        System.out.println("d(Detail)\t s(Search)\t a(Add)\t r(Remove)\t  ctrl+c(Cancel)");
    }

    public static void Detail(int x) {
        x -= 1;
        System.out.println("Judul\t : " + judul.get(x));
        System.out.println("Rilis\t : " + rilis.get(x));
        System.out.println("Genre\t : " + genre.get(x));
        System.out.println("Durasi\t : " + durasi.get(x));
        System.out.println("Sinopsis : " + sinopsis.get(x));
        System.out.println("Cast\t : " + cast.get(x));
        System.out.println("d(Detail)\t s(Search)\t a(Add)\t r(Remove)\t  ctrl+c(Cancel)");
    }

    public static void Adding() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" ");
        judul.add(scan.nextLine());
        System.out.print("Rilis\t :");
        rilis.add(scan.nextLine());
        System.out.print("Durasi\t :");
        durasi.add(scan.nextLine());
        System.out.print("Genre\t :");
        genre.add(scan.nextLine());
        System.out.print("Sinopsis :");
        sinopsis.add(scan.nextLine());
        System.out.print("Cast\t :");
        cast.add(scan.nextLine());
        System.out.println("d(Detail)\t s(Search)\t a(Add)\t r(Remove)\t  ctrl+c(Cancel)");
    }
}