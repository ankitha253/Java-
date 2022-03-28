import java.util.Scanner;
class temp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
if(t<0)
  System.out.println("Freezing weather");
else if(t>=0 && t<10)
  System.out.println("Very Cold weather");
else if(t>=10 && t<20)
  System.out.println("Cold weather");
else if(t>=20 && t<30)
  System.out.println("Normal in temperture");
else if(t>=30 && t<40)
  System.out.println("It's Hot");
else
   System.out.println("It's very hot");
}
}