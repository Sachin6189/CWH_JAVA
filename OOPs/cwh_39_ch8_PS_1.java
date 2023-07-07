//Create a class Employee with following properties and methods:
//Salary(property)(int)
//get Salary(method returning int)
//name(property)(String)
//getName(method returning String)
//setName(method returning name)

class Employee{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class cwh_39_ch8_PS_1 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.setName("Sachin");
        harry.salary = 233;

        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
    }
}
