public class Config{
public static String configName="System Config";
String settingValue;
public static void main(String args[]){
System.out.println("Config Name:"+Config.configName);
Config c =new Config();
c.settingValue="Dark Mode";
System.out.println("Setting 1:"+c.settingValue);
Config c1=new Config();
c1.settingValue="Light Mode";
System.out.println("Setting 2:"+c1.settingValue);
}}