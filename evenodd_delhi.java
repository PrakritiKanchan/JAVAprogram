import java.util.Scanner;
public class evenodd_delhi{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextline();
    int numcar;
    int rem1;
    for(int i=1;i<n;i++)
      {
        carNum=sc.nextline();
        int sumOdd=0;
        intsumEven=0;
        while(carNum!=0){
          rem1=carNum%10;
          if(rem1 %2 !=0){
              sumOdd=sumEven+rem1;
            }
          elseif(rem1%2==0){
            sumEven=sumEven+rem1;
          }
          carNum/=10;
          if(sumOdd %3==0 || sumEven%4==0) {
            System.out.println("YES");
          }
          else{
            System.out.println("NO);
          }
        }
      }
  }
            
          
          
          
