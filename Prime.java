import java.util.Scanner;

public class Prime{

   /**
    * The function checks if a given number is prime or not.
    * 
    * @param number The number parameter represents the integer that we want to check if it is prime or
    * not.
    * @return The method isPrime is returning a boolean value. It returns true if the given number is
    * prime, and false otherwise.
    */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // The code snippet `for (int i = 2; i <= Math.sqrt(number); i++) { if (number % i == 0) {
        // return false; } }` is used to check if the given number is divisible by any number from 2 to
        // the square root of the number.
      
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

   /**
    * This Java program takes a starting and ending number from the user and prints all the prime
    * numbers within that range.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
