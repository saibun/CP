package Patterns;

import java.util.Scanner;

public class Q1_Right_Triangle {
    /* Draw below Pattern
    *
    * *
    * * *
    * * * *
    */
    public void RightTriangle(int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q1_Right_Triangle rt = new Q1_Right_Triangle();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number of row");
            int n=sc.nextInt();
            rt.RightTriangle(n);
        }finally{
            sc.close();
        }
        
    }
    
}
