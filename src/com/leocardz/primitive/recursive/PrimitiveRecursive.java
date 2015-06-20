package com.leocardz.primitive.recursive;

/**
 * Created by leocardz on 17/06/15.
 */
public class PrimitiveRecursive {

    public static void main(String[] args) {
        System.out.println("sum(10, 9) = " + sum(10, 9));
        System.out.println("mult(10, 9) = " + mult(10, 9));
        System.out.println("suc(10) = " + suc(10));
        System.out.println("pred(10) = " + pred(10));
        System.out.println("sub(10, 9) = " + sub(10, 9));
        System.out.println("exp(10, 3) = " + exp(10, 3));
        System.out.println("sg(10) = " + sg(10));
        System.out.println("cosg(10) = " + cosg(10));
        System.out.println("gt(10, 9) = " + gt(10, 9));
        System.out.println("lt(10, 9) = " + lt(10, 9));
        System.out.println("eq(10, 10) = " + eq(10, 10));
        System.out.println("diff(10, 9) = " + diff(10, 9));
    }

    /**
     * Sum (Addition)
     *
     * sum(x, y)
     * -------------------
     * sum(x, 0) = x
     * sum(x, y + 1) = sum(x, y) + 1
     */
    public static int sum(int firstMember, int secondMember) { // colocar numa linha só
        int x = firstMember;
        int y = pred(secondMember); // secondMember = y + 1
        if (secondMember == 0) { // sum(x, 0) = x
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
     * mult(x, 0) = 0
     * mult(x, y + 1) = mult(x, y) + x
     */
    public static int mult(int firstMember, int secondMember) {
        int x = firstMember;
        int y = pred(secondMember); // secondMember = y + 1
        if (secondMember == 0) { // mult(x, 0) = 0
            return 0;
        } else {
            return sum(mult(x, y), x); // mult(x, y) + x
        }
    }

    /**
     * Successor
     *
     * suc(x)
     * -------------------
     * suc(x) = x + 1
     */
    public static int suc(int firstMember) {
        int x = firstMember;
        return sum(x, 1); // x + 1
    }

    /**
     * Predecessor
     *
     * pred(y)
     * -------------------
     * pred(0) = 0
     * pred(y + 1) = y
     */
    public static int pred(int firstMember) {
        int y = firstMember - 1; // firstMember = y + 1
        if (firstMember == 0) { // pred(0) = 0
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
     */
    public static int sub(int firstMember, int secondMember) {
        int x = firstMember;
        int y = pred(secondMember); // secondMember = y + 1
        if (secondMember == 0) { // sub(x, 0) = x
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
     */
    public static int exp(int firstMember, int secondMember) {
        int x = firstMember;
        int y = pred(secondMember); // secondMember = y + 1
        if (secondMember == 0) { // exp(x, 0) = x
            return 1;
        } else {
            return mult(exp(x, y), x);
        }
    }

    /**
     * Signal
     *
     * sg(x)
     * -------------------
     * sg(0) = 0
     * sg(y + 1) = 1
     */
    public static int sg(int firstMember) {
        if (firstMember == 0) { // sg(0) = 0
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Signal Complement
     *
     * cosg(x)
     * -------------------
     * cosg(0) = 1
     * cosg(y + 1) = 0
     */
    public static int cosg(int firstMember) {
        if (firstMember == 0) { // cosg(0) = 0
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Greater than
     *
     * gt(x, y)
     * -------------------
     * gt(x, y) = sg(sub(x, y))
     */
    public static int gt(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember;
        return sg(sub(x, y));
    }

    /**
     * Less than
     *
     * lt(x, y)
     * -------------------
     * lt(y, x) = sg(sub(y, x))
     */
    public static int lt(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember;
        return sg(sub(y, x));
    }

    /**
     * Equal
     *
     * eq(x, y)
     * -------------------
     * cosg(lt(x, y) + gt(x, y))
     */
    public static int eq(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember;
        return cosg(sum(lt(x, y), gt(x, y))); // cosg(lt(x, y) + gt(x, y))
    }

    /**
     * Different
     *
     * diff(x, y)
     * -------------------
     * cosg(eq(x, y))
     */
    public static int diff(int firstMember, int secondMember) {
        int x = firstMember;
        int y = secondMember;
        return cosg(eq(x, y));
    }

}
