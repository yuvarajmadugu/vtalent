package Tasks;

import java.util.Scanner;

public class Assignment6 {

    //Find factorial using do-while:
    public void factorialUsingDoWhile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        int i=1;
        do{
            fact = fact*i;
            i++;
        }while (i<=num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    //Print Fibonacci series using loop:
    public void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci series: ");
        for(int i=1; i<num; i++){
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }
    }

    //Can we make class fully encapsulated? How?:
    //Yes we can make a class fully encapsulated by using private keyword.

    //What happens if we don’t use setters? :
    //values cannot be changed from outside - object becomes immutable from the outside.

    //What is multilevel inheritance? :
    //Class A-> Class B-> Class C (Grandclass - Parent class - Child class)

    //Can wrapper classes be null? :
    //Yes, wrapper classes in java can be null, but primitive types cannot.

    //Why do collections use wrapper classes instead of primitives?:
    //Collections stores objects, primitive types cant store objects

    public void checkPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit ;
            num /= 10;
        }
        if(reversed == original){
            System.out.println("Yes the no. is palindrome");
        }else {
            System.out.println("No the no. is not a palindrome");
        }

    }


    //Print Inverted Right Triangle (using *):
    public void invertedRightTraingle(int num){
        for(int i=1; i<=num; i++){
            for (int j=0; j<=num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Print  Hollow Diamond
    //
    //   *
    //  * *
    // *   *
    //  * *
    //   *
    public void hallowDiamond(int num){
        for(int i=1; i<=num; i++){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print( " *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=num-1; i>=1; i--){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                if(j==1 || j==i) {
                    System.out.print(" *");
                }else {
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }


    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    public void rightTraingle(int num){
        for(int i=1; i<=num; i++) {
            for (int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void characterCount(String input){
        
    }




    public static void main(String[] args) {
        Assignment6 main = new Assignment6();
//        main.factorialUsingDoWhile();
//        main.fibonacci();
//        main.checkPalindrome();
//        main.invertedRightTraingle(5);
//        main.hallowDiamond(5);
//        main.rightTraingle(5);





    }

}
