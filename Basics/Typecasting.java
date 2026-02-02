package Basics;

public class Typecasting {
    //conversion from one datatype to another
    // there are 2 types of typecasting

    //Implicit typecasting:
    //changing datatype from small data range to wider data range it is automatic
    boolean b = true;
    char c = 'a';

    byte bb = 10;
    short s = bb;
    int i = s;
    long l = i;

    float f = l;
    double d = f;


    //Explicit typecasting:
    //conversion of larger data into smaller data this should be done manually by the developer
    float ff = (float)d; // here float at right side is a cast which stores an instance of double b in float datatype
    long ll = (long)f;
    int ii = (int)l;
    short ss = (short)i;
    byte bbb = (byte)s;
}
