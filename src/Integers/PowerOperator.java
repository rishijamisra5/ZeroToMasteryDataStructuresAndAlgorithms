package Integers;

public class PowerOperator {
    public static double powerOf(int a, int b){
        return Math.pow(a,b);
    }

    public static void main (String[] args){
        System.out.println(powerOf(1,2));
        System.out.println(powerOf(5,100));
        System.out.println(powerOf(20,100));
    }
}
