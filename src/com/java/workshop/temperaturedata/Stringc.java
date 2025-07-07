package src.com.java.workshop.temperaturedata;

public class Stringc {
    public static void main(String[]args){
        String sentance = "This program shows how can we split a"+"String into multiple Strings.we need to find sentance,"+"word and letter count";
        String word[]=sentance.split(" ");
        String sentances[]=sentance.split("//.");
        System.out.println(word.length);
        System.out.println(sentances.length);
        System.out.println(sentance.length());
    }
}
