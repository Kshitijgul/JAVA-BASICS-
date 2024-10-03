package JAVA_Programs.OOP_Programming;

public class Ac_01_classesandobject {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        p1.Newtip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        System.out.println("For the Bank Accounjt : ");
        BankAccount A = new BankAccount();
        A.username = "KshitijGuladjhe";
//        A.password  = "kjhsjfhkjdf";      It will show the error
        A.setPassword("Kshitij 12345");
        System.out.println(A.username);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("For Car Info ");
        car c1 = new car();
        c1.set_Driver("Aditya Sharma");
        c1.setCar_no(45678);
        System.out.println(c1.getDriver());
        System.out.println(c1.getCar_no());



    }
}
class car{
    private String driver;
    private int car_no;
    void set_Driver(String newDriver){
        this.driver = newDriver;
    }
    String getDriver(){
        return this.driver;
    }
    void setCar_no(int newcarno){
        this.car_no = newcarno;
    }
    int getCar_no(){
        return this.car_no;
    }
}
class BankAccount{
    public String username ;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
        System.out.println("We cannot print the password");
    }


}
class Pen{
    int tip;
    String color;
    void setColor(String newColor){
        color = newColor;
    }
    void Newtip(int newTip){
        tip = newTip;
    }

}
