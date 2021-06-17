import java.util.Scanner;
public class Main {
    static boolean isPrime(int a, int i){
        if(a==2)
            return true;
        if(i==1)
            return true;
        else if(a % i == 0)
            return false;
        else if(i * i > a)
            return true;
        return isPrime(a,i+1);
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a = input.nextInt();
        if (isPrime(a,2))
            System.out.println(a+" Sayısı Asaldır");
        else
            System.out.println(a+" Sayısı Asal Değildir");
        }
    }
