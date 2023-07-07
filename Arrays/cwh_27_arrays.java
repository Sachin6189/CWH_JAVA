package Arrays;
public class cwh_27_arrays {
    public static void main(String[] args) {
        int marks[] = {21,43,34,42,54};
        //String [] students = {"Sachin","Robin","Bebo"};
        //System.out.println(students.length);
       // System.out.println(marks.length); //finds the length of the array
        //System.out.println(marks[2]);//display the element of the 2nd index

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }     

        //displaying array in reverse order
        System.out.println("printing array in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //for each loop
        System.out.println("printing array using for each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
