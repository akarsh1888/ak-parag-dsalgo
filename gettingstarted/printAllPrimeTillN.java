package gettingstarted;

import java.util.*;

public class printAllPrimeTillN {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            int num =  i;
            int count = 0;
            // checking each number for prime condition
            for (int j = 2; j*j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
    
}