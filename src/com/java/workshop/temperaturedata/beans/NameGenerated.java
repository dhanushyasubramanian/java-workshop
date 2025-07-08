import java.util.Scanner;

public class NameGenerated {

    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter your name");
        String name=input.next();
        System.out.println("enter the gender");
        String gender=input.next();
        System.out.println("enter your qualification");
        String qualification=input.next();
        StringBuilder sb=new StringBuilder();
        if("Female".equalsIgnoreCase(gender));
        {
            sb.append("ms.").append(gender);
            String result=sb.toString();
            System.out.println(result);
        }
        if ("Male".equalsIgnoreCase(gender));
        {
            sb.append("mr.").append(gender);
            String result=sb.toString();
            System.out.println(result);
        }
    }   
}                                                                                                           
