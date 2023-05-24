package Patterns;
public class Q2_Left_Triangle {
    void LeftTriangle(int size){
        for(int i=0;i<size;i++){
            for(int j=1;j<size-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Q2_Left_Triangle lt= new Q2_Left_Triangle();
        lt.LeftTriangle(4);
        
    }
    
}
