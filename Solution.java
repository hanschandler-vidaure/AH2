public class Solution
{
    public static boolean isPrime(int number)
    {
        // Corner case 
        if (number <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < number; i++) 
            if (number % i == 0) 
                return false; 
  
        return true; 
    }
    public static void main (String[] args)
    {
        System.out.println(Solution.isPrime(2)); //-> true
        System.out.println(Solution.isPrime(0)); //-> false
        System.out.println(Solution.isPrime(1));; //-> false
        System.out.println(Solution.isPrime(31));; //-> true
    }
}