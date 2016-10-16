
public class main
{
     
public static void main (String [] args) {
    String lineseparator = System.getProperty ("line.separator");
    userinfo v1 = new userinfo();
    v1.setName ("Sausage");
    v1.setStaffID ("180359");
    v1.setDateofbirth ("October 5th 2000");
    System.out.println ("Name: " + (v1.getName()) + lineseparator + "Staff ID: " + (v1.getStaffID()) + lineseparator +"Date of birth: " + (v1.getDateofbirth()));
  
}
}