import java.util.Scanner;

class Tugas2
{
    static Scanner scr = new Scanner(System.in);

    private static boolean isPrimeNumber(int n)
    {
        if (n < 2){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {    
        int n;

        System.out.print("\n======================\n");
        System.out.print("Masukkan angka: "); n = scr.nextInt();
        System.out.print("========================\n\n");

        for (int i = 0; i <= n; i++)
        {
            if (isPrimeNumber(i)){
                System.out.println(i+" adalah bilangan primer");
            }else{
                System.out.println(i+" bukan bilangan primer");
            }
        }
    }
}