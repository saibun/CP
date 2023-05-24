/*
Suppose, we have to check the number (n) 145 is Peterson or not.
Number = 145
145 = !1 + !4 + !5
=1+4*3*2*1+5*4*3*2*1
=1+24+120
145=145
We observe that the number and the sum of factorials of digits are equal to the number 
itself. Hence, 145 is a Peterson number.
 */
package Number;

import java.util.Scanner;

public class PetersonNumber {
    int sum=0;
    int temp;
    int num;
    int reminder=0;
    public void Operation(){
        System.out.println("Enter a number to chek perterson or not !");
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        temp=num;
        int all_sum=0;
        while(num!=0){
            reminder=num%10;
            int fact_reminder=Factorial(reminder);
            all_sum = addAll(fact_reminder);
            num=num/10;

        }
        boolean outcome = Compare(all_sum);
        if(outcome){
            System.out.println("Peterson number");
        }else{
            System.out.println("Not ");
        }


    }
   

    public int Factorial(int n){
        int result=1;
        while(n!=0){
            result=result*n;
            n=n-1;
        }
        return result;

    }
    public int addAll(int r){
        sum=sum+r;
        return sum;
    }
    public boolean Compare(int digit){
        if(temp==digit){
            return true; 
        }
        return false;
    }
    public static void main(String[] args) {
        PetersonNumber p = new PetersonNumber();
        p.Operation();
    }

}
