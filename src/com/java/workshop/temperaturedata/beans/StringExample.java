import java.util.Arrays;

public class StringExample {

    public static void main(String[]args) {
        String firstName="Dhanushya";
        String lastName= new String("zaraa");
        String shortName="Dhanu";
        String buddyName=new String("Dhanushya)");
        System.out.println(firstName);
        // String fullName = firstName+""+lastName;
        // String finalName = firstName.concat(lastName);
        // System.out.println(finalName.toUpperCase());
        String sentence = "This program shows how can we split a String into multiple String";
        String Words[] = sentence.split("");
        System.out.println(Words.length);
        // System.out.println(Words.length);
    for (String Word: Words)
    {
        System.out.println(Word);
    }
    }
}
