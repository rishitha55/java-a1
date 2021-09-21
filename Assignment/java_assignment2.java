import java.io.*;
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int r,c=0,cube,square;
      while(a>0)
      {
          a=a/10;
          c=c+1;
      }
      System.out.println("Number of digits is "+c);
      if(c%3==0)
      {
          cube=c*c*c;
          System.out.println(c+","+cube);
      }
     if(c%2==0)
      {
          square=c*c;
          System.out.println(c+","+square);
      }
     if(c%2!=0)
      {
          int d=c-1;
          square=d*d;
          System.out.println(c+"["+d+"]"+","+square);
      }
      if((c%2==0)&&(c%3==0))
      {
          square=c*c;
          System.out.println(c+","+square);
      }
    }

}