package com.leocardz.primitive.recursive;

/**
 * Created by leocardz on 17/06/15.
 */
public class PrimitiveRecursive {

    public static void main(String[] args){
        System.out.println("sum(10, 9) = " + sum(10, 9));
        System.out.println("mult(10, 9) = " + mult(10, 9));
        System.out.println("pred(10) = " + pred(10));
        System.out.println("sub(10, 9) = " + sub(10, 9));
        System.out.println("exp(10, 3) = " + exp(10, 3));
    }

    /**
     * Sum (Addition)
     *
     * sum(x, y)
     * -------------------
     * sum(x, 0) = x
     * sum(x, y + 1) = sum(x, y) + 1
     *
     * */
    public static int sum(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember - 1; // secondMember = y + 1
        if(y == -1) { // sum(x, 0) = x
            return x;
        } else {
            return sum(x, y) + 1;
        }
    }

    /**
     * Multiplication
     *
     * mult(x, y)
     * -------------------
     * mult(x, 0) = x
     * mult(x, y + 1) = mult(x, y) + x
     *
     * */
    public static int mult(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember - 1; // secondMember = y + 1
        if(y == -1) { // mult(x, 0) = x
            return 0;
        } else {
            return mult(x, y) + x;
        }
    }

    /**
     * Predecessor
     *
     * pred(y)
     * -------------------
     * pred(0) = 0
     * pred(y + 1) = y
     *
     * */
    public static int pred(int firstMember) {
        int y = firstMember - 1; // firstMember = y + 1
        if(y == -1) { // pred(0) = 0
            return 0;
        } else {
            return y;
        }
    }

    /**
     * Subtraction
     *
     * sub(x, y)
     * -------------------
     * sub(x, 0) = x
     * sub(x, y + 1) = pred(sum(x, y))
     *
     * */
    public static int sub(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember - 1; // secondMember = y + 1
        if(y == -1) { // sub(x, 0) = x
            return x;
        } else {
            return pred(sub(x, y));
        }
    }

    /**
     * Exponentiation
     *
     * exp(x, y)
     * -------------------
     * exp(x, 0) = x
     * exp(x, y + 1) = pred(sum(x, y))
     *
     * */
    public static int exp(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember - 1; // secondMember = y + 1
        if(y == -1) { // exp(x, 0) = x
            return 1;
        } else {
            return mult(exp(x, y), x);
        }
    }

}
