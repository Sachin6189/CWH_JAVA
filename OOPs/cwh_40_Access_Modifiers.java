
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n; 
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
}


}

public class cwh_40_Access_Modifiers {
    public static void main(String[] args) {
    MyEmployee harry = new MyEmployee();
    // harry.id = 45;
    // harry.name = "Harry";  --> Throws an error due to private access modifier
    harry.setId(9);
    System.out.println(harry.getId());
    harry.setName("harry");
    System.out.println(harry.getName());
    }
}
