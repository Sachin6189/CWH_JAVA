//Create a class square with a method to initialize its side, calculating area, perimeter etc.

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class cwh_39_ch8_PS_3 {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
