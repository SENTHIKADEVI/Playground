import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int first=n/100;
    int sec=(n/10)%10;
    int last=n%10;
    int reverse=(last*100)+(sec*10)+(first);
    System.out.println(reverse);
  }
}