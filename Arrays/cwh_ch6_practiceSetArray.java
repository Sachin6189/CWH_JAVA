package Arrays;
//calculate the average marks from an array containing marks of all students in physics using for-each loop

public class cwh_ch6_practiceSetArray {
    public static void main(String[] args) {
      int [] marks = {23,43,44,24,65,23};
      int sum = 0;
      for(int element:marks){
        sum=sum+element;
      }
      System.out.println("the average marks=" + sum/marks.length);
    }
}
