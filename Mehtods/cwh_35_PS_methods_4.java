// write a function to print nth term of fibonacci series using recursion.

package Mehtods;


public class cwh_35_PS_methods_4 {

    static int fib(int n){
       /*  if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        } else{
            return fib(n-1) + fib(n-2);
        }   */

        if (n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int result = fib(7);
        System.out.println(result);
    }
}
