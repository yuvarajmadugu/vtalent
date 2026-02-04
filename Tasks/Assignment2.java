package Tasks;

import java.util.Objects;
import java.util.Scanner;

public class Assignment2 {
    //check a num even or odd:
    public void checkNumEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if(input%2 == 0){
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd.");
        }
    }

    //check a num prime or not:
    public void checkPrimeOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if (input <= 1){
            System.out.println("Not a prime.");
            return;
        }
        int count=0;
        for(int i=2; i<=input/2; i++){
            if(input%2 == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("Not prime.");
        }else {
            System.out.println("Prime.");
        }
    }


    //compare 2 numbers and allocate all comparison operators:
    public void compareTwoNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input1: ");
        int input1 = sc.nextInt();
        System.out.print("Enter input2: ");
        int input2 = sc.nextInt();

        if(input1==input2){
            System.out.println("input1 == input2 : ");
        } if(input1<input2){
            System.out.println("Input1 < Input2");
        } else if (input1>input2) {
            System.out.println("Input1 > Input2");
        }
    }



    //simple calculator
    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What arithmetic operation you want to perform: ");
        String arithmetic_operator = sc.nextLine();
        if(Objects.equals(arithmetic_operator, "+")){
            System.out.print("Enter operand1: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter operand2: ");
            int operand2 = sc.nextInt();
            int result = operand1 + operand2;
            System.out.print("Result = "+result);
        } else if (arithmetic_operator.equals("-")) {
            System.out.print("Enter operand1: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter operand2: ");
            int operand2 = sc.nextInt();
            int result = operand1 - operand2;
            System.out.print("Result = "+result);
        } else if (arithmetic_operator.equals("*")) {
            System.out.print("Enter operand1: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter operand2: ");
            int operand2 = sc.nextInt();
            int result = operand1 * operand2;
            System.out.print("Result = "+result);
        } else if (arithmetic_operator.equals("/")) {
            System.out.print("Enter operand1: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter operand2: ");
            int operand2 = sc.nextInt();
            int result = operand1 / operand2;
            System.out.print("Result = "+result);
        }else {
            System.out.println("Invalid operator.");
        }
    }
    public static void main(String[] args) {
        Assignment2 main = new Assignment2();
//        main.calculator();
//        main.checkNumEvenOrOdd();
//        main.checkPrimeOrNot();
        main.compareTwoNum();
    }

}
