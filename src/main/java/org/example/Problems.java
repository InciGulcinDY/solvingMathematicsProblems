package org.example;

import java.util.ArrayList;

public class Problems {
    public void problem1Solving(int x){
        int total = 0;

        for(int i = 0; i < x; i++){
            if (i%3==0 || i%5==0){
                total+=i;
            }
        }
        System.out.println("Total: " + total);
    }
    public void problem2Solving(){
        //By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
        int n = 2;
        int total = 0;
        int newValue = 0;
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0,1);
        fibo.add(1,1);

        while(fibo.get(n-1) < 4000000){
            newValue = fibo.get(n-1) + fibo.get(n-2);
            fibo.add(n,newValue);
            n++;
            if(newValue%2 == 0 && newValue < 4000000){
                total+=newValue;
            }
        }
        System.out.println("Total of even Fibonacci numbers: " + total);
    }
}
