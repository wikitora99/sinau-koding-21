import java.util.Scanner;

class Tugas2
{
    static Scanner scr = new Scanner(System.in);

    private static String isPrimeNumber(int n)
    {
        if (n < 2){
            return "bukan bilangan primer";
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return "bukan bilangan primer;
            }
        }

        return "adalah bilangan primer";
    }

    public static void main(String[] args) 
    {    
        System.out.print("\n======================\n");
        System.out.print("Masukkan angka: "); int n = scr.nextInt();
        System.out.print("========================\n\n");

        for (int i = 0; i <= n; i++)
        {
            System.out.println(i+" "+isPrimeNumber(i);
        }
    }
}
