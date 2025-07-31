
/*
WRAPPER CLASS:-
A wrapper class is a class in Java that wraps (encapsulates) a primitive data type into an object.
Java provides wrapper classes for all primitive data types.

EXAMPLE :- int   = Integer
           float = Float


 Boxing :-
Converting a primitive data type into its corresponding wrapper class object is called Boxing.

Unboxing :-
Converting a wrapper class object back to its primitive type is called Unboxing.


*/

public class jul30_wrapperClass {
    public static void main(String[] args) {
        int a = 50;                  // primitive data type hai
        Integer A = a;              // Boxing(primitive -> wrapper)

        System.out.println("Boxed value: " + A);

        int b = A;                  // Unboxing(wrapper -> primitive)
        System.out.println("Unboxed value: " + b);
    }
}