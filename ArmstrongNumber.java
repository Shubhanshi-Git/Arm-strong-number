import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" enter the starting range :  ");
        int start = scanner.nextInt();     // take i/p from user
        System.out.println("enter the ending range :  ");
        int end = scanner.nextInt();
        printArmstrongnum( start,end);// method to print armstrong num within a range
        System.out.println("enter the num :    ");
        int num = scanner.nextInt();
        int cube =0;                    // calculate the cube of a num
        for (int j =1; j<=3; j++ ){
            cube = ( num*num *num);
        }
        System.out.println("the cube of num is  " + cube);
    }
    public static void printArmstrongnum( int start, int end ){
        for (int i = start ; i<= end ; i++){
           int num=i;
           int sum = 0;            // initially
           while ( num !=0){
              int rem = num%10;                    // provide the last digit  for ex: 153 %10 = 3;
               sum = sum+ ( rem * rem* rem);     // calculate the sum of cubes of num; for digit 1 sum = 0 + 1^3=1
                                                  // for 5 sum = 1 + 5^3 = 126; for digit 3 sum = 126+ 3^3= 153;
               num = num/10;                         // removing the last digit of num;
           }
           if ( sum == i ){                       // checking if the sum of cubes of num is equal to original num i.e i
               System.out.println(i);
           }
        }
    }

}
