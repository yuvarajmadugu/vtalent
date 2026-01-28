package rough;

public class Assignment1 {
    public static void main(String[] args) {
        //add given input digits:


        //reverse num:
        //brute force:
//        int n=123;
//        int one = n % 10; // to get 3 value
//        System.out.print(one);
//        int two = n / 10; // to delete 3 value
//        int three = two % 10;
//        System.out.print(three);
//        int four = two / 10;
//        System.out.println(four);
        //optimal approach:
//        int n=321;
//        while(n != 0){
//            int x = n%10;
//            System.out.print(x);
//            n /= 10;
//        }



        //take input and print only even numbers until the given input:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a num: ");
//        int num = sc.nextInt();
//        for(int i=0; i<=num; i++){
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        }



        //armstrong number:
        int number = 153;
        //counting number of digits:
        int count = 0;
        int temp = number;
        while (temp != 0){
            temp /= 10;
            count++;
        }
        System.out.println(count);
        int numOfDigits = count;

        //getting each digit of the given number:
        String strNum = Integer.toString(number); //convert to string
        for(int i=0; i<strNum.length(); i++){
            System.out.println(strNum.charAt(i)); //print each character
        }

    }
}

