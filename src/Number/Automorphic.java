package Number;

/*
 *A number is called an automorphic number if and only if the square of the given number 
 ends with the same number itself. 
 For example, 25, 76 are automorphic numbers because their square is 625 and 5776,
 */



 import java.util.Scanner;
 
 class AutomorphicMethod2{
     int square,num_len,temp;
      void Check(int num){
         int square = num * num; 
         num_len=Integer.toString(num).length();
         int reminder = (int) (square%Math.pow(10, num_len));
         if(reminder==num){
             System.out.println("Automorphic Number "+num);
         }else{
             System.out.println("Non Automorphic Number "+num);
         }
         
 
     }
 }
 class AutomorphicNumbersInRange{
     int square,num_len,temp;
      void RangeCheck(){
         System.out.println("Enter maximum range !");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         while(num!=0){
             int square = num * num; 
             num_len=Integer.toString(num).length();
             int reminder = (int) (square%Math.pow(10, num_len));
             if(reminder==num){
                 System.out.println("Automorphic Number "+num);
             }
             num--;
 
         }
         sc.close();
       
         
 
     }
 }
 public class Automorphic {
 
     static boolean isAutomorphic(int num)   
     { 
          
         //determines the square of the specified number  
         int square = num * num;   
         //comparing the digits until the number becomes 0  
         while (num > 0)   
         {
                 
             //find the remainder (last digit) of the variable num and square and comparing them  
             if (num % 10 != square % 10)   
             //returns false if digits are not equal  
             return false;   
             //reduce num and square by dividing them by 10  
             num = num/10;   
             square = square/10;   
         }   
         return true;   
     }  
     public static void main(String[] args) {
         System.out.println(isAutomorphic(76));
         AutomorphicMethod2 a2 = new AutomorphicMethod2();
         a2.Check(75);
         AutomorphicNumbersInRange an = new AutomorphicNumbersInRange();
         an.RangeCheck();
     } 
 }
 
