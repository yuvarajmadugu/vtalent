package Basics;

public class Variables {
    int i; //Instance variable, default value assigned when objected is created
    static int j; //Static variable, created using static keyword, default value assigned when class is loaded into memory

    void method(){
        int k=8;    //local variable, must be explicitly initialized, default value is assigned when the method is called
        System.out.println(k);
    }

    public static void main(String[] args) {
        Variables main = new Variables();

        main.method();
        System.out.println(main.i);
        System.out.println(j);
    }
}
