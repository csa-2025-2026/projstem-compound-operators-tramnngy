public class Problem3
{
  public static void main(String[] args)
  {
    int truncNum = 5678; 
    System.out.println ( truncNum % 10);
    truncNum /= 10;
    System.out.println (truncNum % 10);
    truncNum /= 10; 
    System.out.println ( truncNum % 10);
    truncNum /= 10;
    System.out.println (truncNum % 10);
    truncNum /= 10;
  }
}