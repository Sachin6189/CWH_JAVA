package Mehtods;

public class cwh_32_method_overloading {


    static void foo(){
        System.out.println("Good morning");
    }

    static void foo(int a){
        System.out.println("Hello, World! "+a+" mornin");
    }

    static void foo(int a,int b){
        System.out.println("hii "+a);
        System.out.println("hlo "+b);
    }
    // static void telljoke(){
    //     System.out.println("joke");
    // }
    public static void main(String[] args) {
        // telljoke();


        //Method Overloading
        foo();
        foo(3000);
        foo(20,34);

    }
}
