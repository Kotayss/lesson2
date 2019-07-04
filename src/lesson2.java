

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
public class lesson2 {
    public static void main(String[] args) throws Exception{
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Input a: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Input b: ");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Input c: ");
        double c = Double.parseDouble(reader.readLine());
        double D = Math.sqrt(b*b -4*a*c);
        System.out.println("ax^2 + bx + c = 0");
        if(a == 0){
            if (b == 0){
                if(c == 0)
                    System.out.println("x - любое число");
                if (c != 0)
                    System.out.println("уравнение не имеет решений");
                }
            else
                System.out.println("x = " + (-c/b));
            }
        ///verno
        else if (a > 0){
            if (b != 0 ) {
                if (D >= 0)
                    System.out.println("x1 = " + (-b + D) / (2 * a) + "\nx2 = " + (-b - D) / (2 * a));
                else
                    System.out.println("уравнение не имеет вещественных корней");
            }
            if( b == 0){
                if (c <= 0)
                    System.out.println("x1 = " + Math.sqrt(-c/a) + "\nx2 = " + (-Math.sqrt(-c/a)));
                else
                  System.out.println("уравнение не имеет вещественных корней");
            }

        }
        else if(a < 0){
              if (b != 0) {
                  if (D >= 0)
                      System.out.println("x1 = " + (-b + D) / (2 * a) + "\nx2 = " + (-b - D) / (2 * a));
                  else
                      System.out.println("уравнение не имеет вещественных корней");
              }
              if (b == 0){
                  if (c >= 0)
                      System.out.println("x1 = " + Math.sqrt(c/a) + "\nx2 = " + (-Math.sqrt(c/a)));
                  else
                      System.out.println("равнение не имеет вещественных корней");
              }
            }


    }}

