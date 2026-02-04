package Tasks;

public class Assignment5 {
    //Input a character and use switch to check whether it is a vowel or consonant:
    public char vowelorConsonent(char input){
        switch (input){
            case 'a','A', 'e','E', 'i','I', 'o','O', 'u','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        return input;
    }

    //Print the multiplication table of a given number.
    //n= 5
    public int multiplicationTable(){
        int n=5;
        for(int i=1; i<11; i++){
            System.out.println("5 * "+ i  +" = " + n*i);
        }
        return n;
    }

    //Find the largest number in an array using foreach:
    public void largestNumber(){
        int[] arr = new int[]{10, 1, 5, 0, 20};
        int max = arr[0];
        for(int largest: arr){
            if(largest > max){
                max = largest;
            }
        }
        System.out.println(max);
    }

    //Create an integer array and use foreach to calculate the sum, Use if to check if sum is greater than 100, Print result:
    public void calculateSum(){
        int[] arr = new int[]{100,2,3,4,5};
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        if(sum > 100){
            System.out.println("yes the sum is greater than 100.");
        }
        System.out.println(sum);
    }


    //Search for a number in an array. If found, print Found and break:
    public int findANum(int num){
        int[] arr = new int[]{1,2,3,4,5};
        for(int a: arr){
            if(a == num) {
                System.out.println("Founnd");
                break;
            }
        }
        System.out.println("Not found");
        return num;
    }


    //Print star pattern (pyramid):
    public void starPyramid(int num){
        for(int i=1; i<=num; i++){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }


    //Find sum of digits.
    //n = 456
    public void sumOfDigits(int num){
        int sum=0;
        while (num != 0){
            int numb = num % 10;
            sum += numb;
            num /= 10;
        }
        System.out.println(sum);
    }


    //Swap two numbers without temp variable:
    public void swapTwoNums(){
        int a=10;
        int b=20;
        a= a^b;
        b= b^a;
        a= b^a;
        System.out.println("a is: " +a);
        System.out.println("b is: " +b);
    }

    //reverse a num:
    public void reverseANum() {
        int n = 321;
        while (n != 0) {
            int x = n % 10;
            System.out.print(x);
            n /= 10;
        }
    }


    public static void main(String[] args) {
        Assignment5 main = new Assignment5();
//        main.vowelorConsonent('A');
//        main.multiplicationTable();
//        main.largestNumber();
//        main.calculateSum();
//        main.findANum(6);
//        main.starPyramid(5);
//        main.sumOfDigits(456);
//        main.reverseANum();
        main.swapTwoNums();

    }
}
