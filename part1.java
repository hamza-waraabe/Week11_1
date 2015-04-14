import java.util.Scanner;




public class part1{
    public static void main(String[] args) { 
         System.out.println(h(input())); 
         System.out.println(f(input(), input())); 
         System.out.println(g(input(),input(),input())); 
     } 
     public static double h(double x) 
     { 
         return power(x, 10); 
     } 
     public static double f(double x, double y) 
     { 
         return x+y; 
     } 
     public static double g(double x, double y, double z) 
     { 
     return radical(x)+absolute(y)+powerz(z,y); 
     } 
     public static double input() 
     { 
         System.out.println("Enter a number"); 
         Scanner keyboard = new Scanner(System.in); 
         return keyboard.nextDouble(); 
     } 
     public static double power(double x, double y) 
     {    double v=x; 
         for (double i=1; i<y;i++) 
         { 
         x*=v; 
         } 
     return x; 
     } 
     public static double powerz(double z, double y) 
     {    double v=z; 
         for (double i=1; i<y;i++) 
         { 
         z=z*v; 
         } 
     return z; 
     } 
     public static double absolute(double y) 
     {    if (y>0) 
         return y; 
         else return -y; 
     } 
     public static double radical(double x) 
     {double q,num=x; 
     double sqrt=num/2; 
     do { 
         q=sqrt; 
         sqrt=(q+(num/q))*0.5; 
         }while ((q-sqrt)!=0); 
         return sqrt; 
     } 
 } 

