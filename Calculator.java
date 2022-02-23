public class Calculator
{

  public static int add(int a, int b)
  {
    System.out.println("Adding the numbers...");
    return a + b;
  }

  public static void main(String [] args)
  {
    int a = 8;
    int b = 9;
    int c = add(a, b);
    System.out.println("Result: " + c);
  }
}
