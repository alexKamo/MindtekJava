package VariablesIntro;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos =0;
        System.out.println("Enter 3 int");
        int num = sc.nextInt();
        if (num>0) pos++; //pos = pos+1;

        num = sc.nextInt();
        if (num>0) pos++;

        num = sc.nextInt();
        if (num>0) pos++;

        System.out.println("Total positive: " +pos);
        System.out.println("Total negative: " + (3-pos));

    }
}

