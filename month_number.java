import java.util.Scanner;
public class month_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any month number");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("NUMBER OF DAYS == 31 ");
        }
        else if(num==2){
            System.out.println("NUMBER OF DAYS ==  29");
        }
        else if(num==3){
            System.out.println("NUMBER OF DAYS == 31");
        }
        else if(num==4){
            System.out.println("NUMBER OF DAYS ==  30");
        }
        else if(num==5){
            System.out.println("NUMBER OF DAYS == 31");
        }
        else if(num==6){
            System.out.println("NUMBER OF DAYS ==  30");
        }
        else if(num==7){
            System.out.println("NUMBER OF DAYS == 31");
        }
        else if(num==8){
            System.out.println("NUMBER OF DAYS == 31");
        }
        else if(num==9){
            System.out.println("NUMBER OF DAYS == 30");
        }
        else if(num==10){
            System.out.println("NUMBER OF DAYS == 31");
        }
        else if(num==11){
            System.out.println("NUMBER OF DAYS ==  30");
        }
        else if(num==12){
            System.out.println("NUMBER OF DAYS == 31");
        }
    }
}
