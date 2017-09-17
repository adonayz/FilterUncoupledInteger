package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArr = input.split(",");

        int finalNum = 0;

        for(String num: inputArr){
            finalNum ^= Integer.parseInt(num.trim());
        }

        System.out.println(finalNum);
    }
}
