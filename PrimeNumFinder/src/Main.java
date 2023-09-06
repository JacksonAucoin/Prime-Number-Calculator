import java.util.ArrayList;
import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive number and hit enter, then enter another positive number and hit enter and the code will print all the prime numbers in that range:");
        int start = s.nextInt();
        s.nextLine();
        int end = s.nextInt();
        ArrayList<Integer> primes = generatePrimes(start, end);
        System.out.println(primes);
    }


    public static ArrayList<Integer> generatePrimes(int start, int end)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        for(int num = start; num <= end; num++ )
        {
            if (isPrime(num))
            {
                primes.add(num);
            }
        }
        return primes;
    }
    public static boolean isPrime(int num)
    {
        for(int i = 2; i <= Math.sqrt(num); i++ )
         {
             if(num % i ==0)
             {
                 return false;
             }

         }
        return true;
    }
}

