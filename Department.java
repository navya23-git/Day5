public class Department{
public static String department ="HR";
String employeeName;
public static void main(String args[]){
System.out.println("Department:"+department);
Department d=new Department();
d.employeeName="Jhon";
System.out.println("employee 1:"+d.employeeName);
Department d1=new Department();
d1.employeeName="Alice";
System.out.println("employee 2:"+d1.employeeName);
department="Marketing";
System.out.println("Department:"+department);
d.employeeName="John";
System.out.println("employee 1:"+d.employeeName);
d1.employeeName="Alice";
System.out.println("employee 2:"+d1.employeeName);


}}