import java.util.Scanner;
class beg15
{
public static void main(String[] args)
{
int a,b,i;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
for(i=a+1;i<=b;i++)
{
if(i%2==0)
{
System.out.println(i+ " ");
}
}
}
}
