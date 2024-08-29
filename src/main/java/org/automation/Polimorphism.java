package org.automation;


class Operation {
    public int add(int a, int b) {
        return a + b;
    }

// Overloading: Change int to double
public double add (double a, double b){
    return a+b;
}

// Overloading: Parameter menjadi 3
public int add (int a, int b, int c){
    return a+b+c;
}
}


public class Polimorphism {
    public static void main(String[] args){
        Operation op = new Operation();
        Operation MulOv = new MultiplyOverride();
        int result1 = op.add(5,10);
        int result2 = op.add(5, 10, 3);
        double result3 = op.add(10.5, 19.1);
        int result4 = MulOv.add(5, 10);
        System.out.println("Operation (5,10)"+ result1);
        System.out.println("Operation (5,10,3)"+ result2);
        System.out.println("Operation (10.5,19.1)"+ result3);
        System.out.println("MultiplyOverride (5,10)"+ result3);

    try{
        int result = 10/0;
    }catch(ArithmeticException e){
        System.out.println("Caught Aritmetic Exception"+e.getMessage());
    }

    try{
        int [] arr= new int[5];
        int index= arr [10];

    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Caught ArrayIndexOutOfBoundsException"+e.getMessage());
    }

    try {
        String str = null;
        str.length();
    }catch (NullPointerException e){
        System.out.println("Caught NullPointerException"+e.getMessage());

    }
    try{
        String str = "Adelyasssssssss";
        char ch = str.charAt(100);
    }catch (StringIndexOutOfBoundsException e){
        System.out.println("Caught StringIndexOutOfBoundsException"+e.getMessage());

    }

    try{
        Thread t = new Thread();
        t.start();
        t.start(); // Mencoba memanggil fungsi lainnya saat fungsi sebelumnya belum selesai dijalankan.
    }catch (IllegalThreadStateException e){
        System.out.print("Caught IllegalThreadStateException"+e.getMessage());

    }

}}

// Overriding
class MultiplyOverride extends Operation{
    @Override
    public int add(int a, int b) {
        return a*b;
    }
}
