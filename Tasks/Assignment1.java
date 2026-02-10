package Tasks;

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
        int num = 153;

        int originalNum = num;
        int digits = 0;
        int sum = 0;

        //count digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        //calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        //check num or not
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong numb");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong numb");
        }
    }
}
