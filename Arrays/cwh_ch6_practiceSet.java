package Arrays;
//Create a program to find out whether a given integer is present in an array or not.

public class cwh_ch6_practiceSet {
public static void main(String[] args) {
    int[] arr = {23,43,22,46,78,76};
    int num = 46;
    boolean isInArray = false;  
    for(int element:arr){
        if (element ==num ){
            isInArray = true;
            break;
    }
}    
if(isInArray){
    System.out.println("Element found");
}
else{
    System.out.println("Element Not Found");
}
}
}
