//Create a class Tommyvecetti for Rockstar Games capable of hitting(print hitting...), firing, etc.

class Tommy{
    public void hit(){
        System.out.println("Tommy is hitting");
    }
    public void run(){
        System.out.println("Tommy is running");
    }
    public void fire(){
        System.out.println("Tommy is firing");
    }
}

public class cwh_39_ch8_PS_4 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.hit(); // prints "Tommy is hitting"
        player1.run();  //prints "Tommy is running"
        player1.fire();   //prints "Tommy is firing"
    }
}
