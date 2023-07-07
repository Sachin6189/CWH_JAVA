package Arrays;
//Write a java program to find whether an array is sorted or not.

public class cwh_ch6_practicesetArrays7 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {43,632,76,2245,753,3224};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted =false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array Sorted");
    }
    else{
        System.out.println("Array Not Sorted");
    }
    }
}
