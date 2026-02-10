package Tasks;

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
        char[] copy = s.toCharArray();
        System.out.print("Duplicate characters: ");
        int count=0;

        for(int i=0; i< copy.length; i++){
            for(int j=0; j<i; j++){
                if(copy[i] == copy[j]){
                    count++;
                    System.out.print(copy[i]+" ");
                }
            }
        }
        System.out.println("Count : " +count);
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
    public void removeDuplicatesInArray() {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index] = arr[i];
                index++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }


    /*
    //Find First Non-Repeating Character
    //String s = "swiss";
    public void findNonRepeatingCharacters(){
        String s= "swiss";
        char[] chars = s.toCharArray();
        for(int i=0; i< chars.length; i++){
            for(int j=0; j<i; j++){
                if(chars[i]== )
            }
        }
    }
    */


    public static void main(String[] args) {
        Assignment7 main = new Assignment7();
//        main.largestNumAmongThree();
//        main.countEvenAndOdd();
//        main.findDuplicates();
//        main.SumOfFirstNNums();
//        main.removeDuplicatesInArray();
//        main.findNonRepeatingCharacters();






    }

}
