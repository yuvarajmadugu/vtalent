package Tasks;

import java.util.Arrays;

public class Assignment7 {

    //Difference between Primitive and Non-Primitive Data Types :
    //Primitive data types stores single value, fixed size, uses stack memory (eg: int, char, boolean)
    // while Non-primitive data types store mutliple values, no fixed size, uses heap memory (eg: string, array, object, interface)


    //What are Access Modifiers? :
    //Access Modifiers are keywords reserved in java that restrict access for security among classes, packages, sub-classes.
    // They mainly secure datamembers of the class which are variables and methods.


    //Find the Largest of Three Numbers :
    public void largestNumAmongThree(){
        int a=10;
        int b=25;
        int c=15;
        int result = (a>b) ? (a>c? a: c) : (b>c? b: c);
        System.out.println(result);
    }


    //Count Even & Odd Numbers:
    public void countEvenAndOdd(){
        int[] arr = {1,2,3,4,5};
        int even=0;
        int odd=0;
        for(int num: arr){
            if(num % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: "+even+ ", Odd: "+odd);
    }


    //Find Duplicate Characters
    //String s="programming";
    public void findDuplicates(){
        String s = "programming";
        String copy = s;
        System.out.println("Duplicate characters: ");

        for(int i=0; i< copy.length(); i++){
            char ch = copy.charAt(i);
            System.out.print(ch);

        }
    }


    //Print Sum of First N Numbers:
    public void SumOfFirstNNums(){
        int num = 20;
        int sum=0;
        for(int i= 1; i<= num; i++){
            sum+= i;
        }
        System.out.println(sum);
    }


    //Remove Duplicate Elements from Array:
    public void removeDuplicatesInArray(){
        int[] arr = {1,2,2,3,4,4,5};
        int[] arr2 = arr;
        int[] arr3;

        for (int i=1; i< arr.length-1; i++){
            if(arr2[i] != arr[i]){
                arr3 = ;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }


    public static void main(String[] args) {
        Assignment7 main = new Assignment7();
//        main.largestNumAmongThree();
//        main.countEvenAndOdd();
//        main.findDuplicates();
//        main.SumOfFirstNNums();
        main.removeDuplicatesInArray();

    }

}
