package Arrays;

import java.util.Arrays;

public class CopyElement {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array is "+ Arrays.toString(arr));
        CopyElement ce = new CopyElement();
        int[] clone =ce.CopryArray(arr);
        System.out.println("Clone Array is "+Arrays.toString(clone));
    }
    public int[] CopryArray(int arr[]){
        int newarr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }

        return newarr;
    }
    
}

