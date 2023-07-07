package Arrays;
//write a JAVA program to find the maximum element in an array

public class cwh_ch6_practicesetArray6 {
    public static void main(String[] args) {
        int [] arr = {32,554,255,256,644,45};
        int max = 0;
        for(int element:arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("the maximum value of the array is = " + max);
    }
    
}
