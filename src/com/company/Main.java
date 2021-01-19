package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("result: " +sumOfDigits(321));
    }

    private static int sumOfDigits(int num){

        int sum = 0;
        if(num < 10) {
            return -1;
        }
            while(num > 0){
                int digit = num % 10;
                sum += digit;

                num /= 10;
            }

return sum;
    }

}
