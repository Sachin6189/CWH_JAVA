//Create a class cellphone with methods to print "ringing", "vibrating", etc.

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }    

    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling friend...");
    }
}

public class cwh_39_ch8_PS_2 {
    public static void main(String[] args) {
        cellphone mi11x = new cellphone();
        mi11x.callFriend();
        mi11x.vibrate();
        mi11x.ring();
    }
}
