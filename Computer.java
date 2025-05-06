public class Computer{
public static String os="Window";
String ram;
public static void main(String args[]){
System.out.println("os:"+os);
Computer c=new Computer();
c.ram="8GB";
System.out.println("Computer 1 RAM:"+c.ram);
Computer c1=new Computer();
c1.ram="16gb";
System.out.println("Computer 2 RAM:"+c1.ram);


}}