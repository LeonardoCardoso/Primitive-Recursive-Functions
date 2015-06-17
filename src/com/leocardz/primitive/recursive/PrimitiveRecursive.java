package com.leocardz.primitive.recursive;

/**
 * Created by leocardz on 17/06/15.
 */
public class PrimitiveRecursive {

    public static void main(String[] args){
        int a = sum(10, 9);
        System.out.print(a);
    }

    /**
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

}
