import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      System.out.println("The given value is "+a);
      int b=s.nextInt();
      System.out.println("The second value is "+b);
      int check=b%a;
      if(a%2==0 && ((a*a==b)&&(check==0)))
      {
          int c=b/a;
          System.out.println("A is even, B is sqaure of a and its multiple is "+c);
      }
      else if((a*a!=b)&&(check==0))
      {
          int c=b/a;
           System.out.println("B is not a sqaure of a and its multiple is "+c);
      }
      else
      {
          System.out.println("B is neither square of A nor multiple of A");
      }
    }
}