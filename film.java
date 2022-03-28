import java.util.Scanner;
class film
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String he1,he2;
int h1,h2,f1,f2,a1,a2,t1,t2;
he1=sc.nextLine();
he2=sc.nextLine();
h1=sc.nextInt();
h2=sc.nextInt();
f1=sc.nextInt();
f2=sc.nextInt();
a1=sc.nextInt();
a2=sc.nextInt();
t1=h1*10+a1*5-f1*5;
t2=h2*10+a2*5-f2*5;
System.out.println("he1"+t1);
System.out.println("he2"+t2);
if(t1>t2)
    System.out.println(he1);
else
    System.out.println(he2);
}
}