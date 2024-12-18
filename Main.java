import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // Problem 1
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    while (a <= b)
    {
      if (a % 2 == 1)
      {
        System.out.println(a + " ");
      }
      a++;
    }
  
  // Problem 2
   System.out.println("Enter a positive number");
   int num = sc.nextInt();
   int degree = 0;
   while (num > 0)
   {
    int last_digit = num % 10;
    num /= 10;
    double place_value = Math.pow(10, degree);
    System.out.println((int) (last_digit * place_value));
    degree++;
   }
  }
}
