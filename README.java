import java.io.*;
import java.util.*;
class Factorial
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int fact=1;
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
   System.out.println(fact);
   }
}
