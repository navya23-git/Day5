public class Product{
public static String category="Electronics";
String productName;
public static void main(String args[]){
System.out.println("category:"+Product.category);
Product p=new Product();
p.productName="laptop";
System.out.println("product 1:"+p.productName);
Product p1=new Product();
p1.productName="Smart Phone";
System.out.println("product 2:"+p1.productName);
}}

