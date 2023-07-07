package Arrays;
//Create an array 5 floats and calculate their sum

public class cwh_29_practiceSet6 {
    public static void main(String[] args) {
        float[] marks = {45.7f,68.3f,93.4f,43.5f,65.6f};
        float sum = 0;
        for(float element:marks) {
            sum = sum+element;
        }
        System.out.println("the value of sum is = " + sum );
    }
}
