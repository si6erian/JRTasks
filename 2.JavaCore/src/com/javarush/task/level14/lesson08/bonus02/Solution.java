package com.javarush.task.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int i = 0;
        int x = 0,y = 0;
/*        while (i < 2)
            try
            {
                i++;
                if (i == 1)
                {
                    System.out.print("Enter the first int: ");
                    x = Integer.parseInt(reader.readLine());
                } else
                {
                    System.out.print("Enter the second int: ");
                    y = Integer.parseInt(reader.readLine());
                }
            }
            catch (Exception e)
            {
                System.out.println("It's not integer, please try again!");
                i--;
            }
        System.out.println("Greatest common divisor is: " + gcd(x,y));
        */
        x = Integer.parseInt(reader.readLine());
        y = Integer.parseInt(reader.readLine());
        if (x > 0 && y > 0)
            System.out.println(gcd(x,y));
    }

    public static int gcd(int a, int b){
        return (b == 0) ? a : gcd(b, a % b);
    }

}


