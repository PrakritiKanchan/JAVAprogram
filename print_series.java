import java.util.Scanner;
public class print_series{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n,m,x,d=0;
	  int n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=1;i<=n;i++)
	{
		for(int j=(d+i);j<=1001;j++)
        {
            x=(3*j)+2;
            if(x%m!=0)
            {
               System.out.println("x");
            }
            else
            {
              System.out.println("d");
        }
	  }
	}
    
