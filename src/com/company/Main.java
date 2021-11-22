package com.company;
import java.util.Scanner;
public class Main {

    static int fact(int n){
        int res=1;
        while (n!=0){
            res=res*n;
            n--;}
        return res;}
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 14:");
        int n = scan.nextInt();
        if (0<=n && n<15){
            int res = fact(n);
            System.out.println("Факториал от " + n + ":" + res);}
        else System.out.println("Ошибка");
    }

}









