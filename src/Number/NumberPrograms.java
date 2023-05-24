package Number;
import java.util.Scanner;
//Problem 1
class Revers_A_Number{
    private int reverse;
    Revers_A_Number(){
        reverse=0;
    }
    public int Process(int num){
        while(num!=0){
            int reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;
        }
        return reverse;
    }
    public void Call(){
        System.out.println("Enter a number to get its reverse order number !");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            int user_input=scan.nextInt();
            System.out.println("The reverse number is "+Process(user_input));
        }
        else{
            System.out.println("Plese enter number only");
        }
        scan.close();
    }
}
//Problem 2 - convert a number into word
class ConvertNumberWord extends Revers_A_Number{
    public void Convert(int num){
        String s_num=Integer.toString(num);
        if(s_num instanceof String){
            System.out.println(s_num + " is string type now");
        }
        else{
            System.out.println("Not string type");
        }
        

    }

}
public class NumberPrograms {
    public static void main(String[] args) {
        //Problem 1
        Revers_A_Number rn = new Revers_A_Number();
        rn.Call();
        ConvertNumberWord cnw = new ConvertNumberWord();
        cnw.Convert(101);
        
      
        
    }
    
}
