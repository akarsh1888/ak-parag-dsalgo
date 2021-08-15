package gettingstarted;

import java.util.*;

public class countNoOfDigitsInNumber {
    
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int number = scn.nextInt();
        int count = 0 ;
        while (number!=0) {
            number =  number/10;
            count++;
        }

        System.out.println(count);
    }
}
