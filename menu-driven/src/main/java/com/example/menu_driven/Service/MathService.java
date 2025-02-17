package com.example.menu_driven.Service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public long calculateFact(int num){
        int i, fact = 1;
        for(i = 1;i<=num;i++){
            fact = fact *i;
        }
        return fact;
    }

    public long calculateFibo(int num){
        int a=0,b=1,c,i;
        for(i=1;i<=num;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(a + " ");
            System.out.println();
        }
        return b;
    }

    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

