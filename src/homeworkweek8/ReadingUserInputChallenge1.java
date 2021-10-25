package homeworkweek8;

import java.util.Scanner;

public class ReadingUserInputChallenge1 {
    public static void main(String[] args) {

        int sum =0;
        int i=0;
        int num=0;
        System.out.println("Enter number:");

       Scanner input= new Scanner (System.in);
        System.out.println ("Enter number # : "+ num);
        num=input.nextInt ();

        Scanner scan = new Scanner(System.in);
        while(i<=10){
            num = scan.nextInt();
            sum = sum+num;
            i++;
            if(i>10){
                System.out.println("Invalid number");

            }
            System.out.println("sum =" +sum);
        }

        scan.close();
    }
}
