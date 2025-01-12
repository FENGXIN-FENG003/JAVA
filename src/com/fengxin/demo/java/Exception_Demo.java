package com.fengxin.demo.java;

import java.util.Scanner;

/**
 * @author FENGXIN
 **/
public class Exception_Demo {
    public static void main (String[] args) {
        String[]  cal = new String[2];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入两个数字：");
            cal[0] = scanner.next ();
            cal[1] = scanner.next ();
            try {
                int n1 = Integer.parseInt (cal[0]);
                int n2 = Integer.parseInt (cal[1]);
                System.out.println (calculate (n1 , n2));
            } catch (NumberFormatException e) {
                System.out.println ("输入的不是数字，请重新输入");
            } catch (ArithmeticException e){
                System.out.println ("除数不能为0，请重新输入");
            }finally {
                System.out.println("-----------------------------------------");
            }
        }
    }
    public static double calculate(int n1,int n2){
        return n1/n2;
    }
}
