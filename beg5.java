import java.util.Scanner;
class Largest
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Input:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println(x+" " + y +" "+ z);
        System.out.println("Output:");
        if (x > y && x > z)
        {
          System.out.println(x);
        }
        else if (y > x && y > z)
        {
          System.out.println(y);
        }
        else if (z > x && z > y)
        {
          System.out.println(z);
        }
        else
        {
          System.out.println("invalid");
        }
    }
}
