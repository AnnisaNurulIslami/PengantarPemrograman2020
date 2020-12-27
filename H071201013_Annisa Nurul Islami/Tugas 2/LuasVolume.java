import java.util.Scanner;

class LuasVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar:");
        System.out.println("2. Mencari Volume Bangun Ruang:");
        System.out.println();
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        
        try
        {
            int menu = input.nextInt();
            double s,p,l,a,t,r,jss,d1,d2,aLimas,aPrisma;
            double pi = 3.14;
            
            switch (menu) {
                case 1 :
                    System.out.println("** Pilih Bangun Datar **");
                    System.out.println("1. Persegi");
                    System.out.println("2. Persegi Panjang");
                    System.out.println("3. Segitiga");
                    System.out.println("4. Lingkaran");
                    System.out.println("5. Jajar Genjang");
                    System.out.println("6. Trapesium");
                    System.out.println("7. Belah Ketupat");
                    System.out.println("8. Layang-Layang");
                    System.out.println();
                    System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
                    int bangun = input.nextInt();
                    switch (bangun) {
                        case 1 :
                            System.out.println("Input Sisi");
                            s = input.nextDouble();
                            double lPersegi = s * s;
                            System.out.println("Luas Persegi = " + lPersegi);
                            break;
                        case 2 :
                            System.out.println("Input Panjang");
                            p = input.nextDouble();
                            System.out.println("Input Lebar");
                            l = input.nextDouble();
                            double lPersegiPanjang = p * l;
                            System.out.println("Luas Persegi Panjang = " + lPersegiPanjang);
                            break;
                        case 3 :
                            System.out.println("Input Alas");
                            a = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double lSegitiga = (a * t) / 2;
                            System.out.println("Luas Segitiga = " + lSegitiga);
                            break;
                        case 4 :
                            System.out.println("Input Jari-Jari" );
                            r = input.nextDouble();
                            double lLingkaran = pi * r * r;
                            System.out.println("Luas Lingkaran = " + lLingkaran);
                            break;
                        case 5 :
                            System.out.println("Input Alas");
                            a = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double lJajarGenjang = a * t;
                            System.out.println("Luas Jajar Genjang = " + lJajarGenjang);
                            break;
                        case 6 :
                            System.out.println("Input Jumlah Sisi Sejajar (Sisi Atas + Sisi Bawah) : ");
                            jss = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double lTrapesium = (jss * t) / 2;
                            System.out.println("Luas Trapesium = " + lTrapesium);
                            break;
                        case 7 :
                            System.out.println("Input Diagonal 1");
                            d1 = input.nextDouble();
                            System.out.println("Input Diagonal 2");
                            d2 = input.nextDouble();
                            double lBelahKetupat = (d1 * d2) / 2;
                            System.out.println("Luas Belah Ketupat = " + lBelahKetupat);
                            break;
                        case 8 :
                            System.out.println("Input Diagonal 1");
                            d1 = input.nextDouble();
                            System.out.println("Input Diagonal 2");
                            d2 = input.nextDouble();
                            double lLayang = (d1 * d2) / 2;
                            System.out.println("Luas Layang-Layang = " +  lLayang);
                            break;
                        default :
                            System.out.println("Masukkan menu yang benar : ");        
                }        
                    break;
                case 2 :
                    System.out.println("** Pilih Bangun Ruang **");
                    System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Limas");
                    System.out.println("4. Prisma");
                    System.out.println("5. Tabung");
                    System.out.println("6. Kerucut");
                    System.out.println("7. Bola");
                    System.out.println();
                    System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan :");
                    bangun = input.nextInt();
                    switch (bangun) {
                        case 1 :
                            System.out.println("Input Sisi");
                            s = input.nextDouble();
                            double vKubus = s * s * s;
                            System.out.println("Volume Kubus = " + vKubus);
                            break;
                        case 2 :
                            System.out.println("Input Panjang");
                            p = input.nextDouble();
                            System.out.println("Input Lebar");
                            l = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double vBalok = p * l * t;
                            System.out.println("Volume Balok = " + vBalok);
                            break;
                        case 3 :
                            System.out.println("Input Luas Alas");
                            aLimas = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double vLimas = (aLimas * t) / 3;
                            System.out.println("Volume Limas = " + vLimas);
                            break;
                        case 4 :
                            System.out.println("Input Luas Alas");
                            aPrisma = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double vPrisma = aPrisma * t;
                            System.out.println("Volume Prisma = " + vPrisma);
                            break;
                        case 5 :
                            System.out.println("Input Jari-Jari");
                            r = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double vTabung = pi * r * r *t;
                            System.out.println("Volume Tabung = " + vTabung);
                            break;
                        case 6 :
                            System.out.println("Input Jari-Jari");
                            r = input.nextDouble();
                            System.out.println("Input Tinggi");
                            t = input.nextDouble();
                            double vKerucut = (pi * r * r * t) / 3;
                            System.out.println("Volume Kerucut = " + vKerucut);
                            break;
                        case 7 :
                            System.out.println("Input Jari-Jari");
                            r = input.nextDouble();
                            double vBola = (4 * pi * r * r * r) / 3;
                            System.out.println("Volume Bola = " + vBola);
                            break;
                        default :
                            System.out.println("Masukkan menu yang benar :");      
                }
                    break;
                    
                default :
                System.out.println("Masukkan menu yang benar :");
            }
        }
        catch (Exception error) {
            System.out.println("Masukkan menu yang benar :");
        }
    }
}