package Number;

public class SunnyNumber {
    int inp_num;
    SunnyNumber(int num){
        this.inp_num=num;

    }
    public void Check(){
        int actual_num=inp_num+1,squer_value=0;
        boolean cond=false;
        int loop_length=actual_num/2;
        for(int i=1;i<=loop_length;i++){
            squer_value=i*i;
            if(squer_value==actual_num){
                cond=true;
                break;
            }

        }
        if(cond){
            System.out.println(this.inp_num+ " is a SunnyNumber.");
        }else{
            System.out.println(this.inp_num+ " is not a SunnyNumber.");
        }

    }
    public static void main(String[] args) {
        SunnyNumber sn = new SunnyNumber(80);
        sn.Check();
        
    }
}
