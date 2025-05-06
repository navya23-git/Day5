public class Car1{
public static String companyName="Honda";
       String carModel="Civic";
public static void main(String args[]){
System.out.println("company:"+Car1.companyName);
Car1 c=new Car1();
System.out.println("Car 1 model"+c.carModel);
Car1 c1=new Car1();
c1.carModel="Accord";
System.out.println("Car 2 model"+c1.carModel);

}}