import java.util.Scanner;

class Tugas3
{
    static Scanner scr = new Scanner(System.in);

    static void persegi(float S)
    {
        System.out.print("Keliling Persegi = "+(4 * S)+"\n");
        System.out.print("Luas Persegi = "+(S * S)+"\n");
    }

    static void segitiga(float S, float a, float t)
    {
        System.out.print("Keliling Segitiga = "+(3 * S)+"\n");
        System.out.print("Luas Segitiga = "+(0.5 * a * t)+"\n");
    }

    static void lingkaran(float r)
    {
        System.out.print("Keliling Lingkaran = "+(2 * Math.PI * r)+"\n");
        System.out.print("Luas Lingkaran = "+(Math.PI * r * r)+"\n");
    }

    public static void main(String[] args) 
    {
        int cs = 1;
        float S, a, t, r;

        while (cs == 1 || cs == 2 || cs == 3) 
        {
            System.out.print("\nMenghitung Bangun Datar\n");
            System.out.print("=======================\n");
            System.out.print("1. Persegi\n2. Segitiga (sama sisi)\n3. Lingkaran\n4. Keluar\n");
            System.out.print("=======================\n");
            System.out.print("Masukkan pilihan: "); cs = scr.nextInt();
            System.out.print("=======================\n\n");

            switch (cs) {
                case 1:
                    System.out.print("Bangun Datar Persegi\n");
                    System.out.print("=======================\n");
                    System.out.print("Masukkan nilai sisi: "); S = scr.nextFloat();
                    System.out.print("=======================\n");
                    persegi(S);

                    break;
                case 2:
                    System.out.print("Bangun Datar Segitiga\n");
                    System.out.print("=======================\n");
                    System.out.print("Masukkan nilai sisi: "); S = scr.nextFloat();
                    System.out.print("Masukkan nilai alas: "); a = scr.nextFloat();
                    System.out.print("Masukkan nilai tinggi: "); t = scr.nextFloat();
                    System.out.print("=======================\n");
                    segitiga(S, a, t);

                    break;
                case 3:
                    System.out.print("Bangun Datar Persegi\n");
                    System.out.print("=======================\n");
                    System.out.print("Masukkan nilai jari-jari: "); r = scr.nextFloat();
                    System.out.print("=======================\n");
                    lingkaran(r);

                    break;
                default:
                    System.out.print("Program selesai~\n\n");
                    System.exit(0);
            }
        }
    }

}