package aaaa;

import java.util.EnumSet;

public class convertingNumber {
    public static void main(String[] args) {
        int num=123;
        while (num>0) {
            int reverse = num%10;
            System.out.println(reverse);
            num=num/10;

        }

    }
}
