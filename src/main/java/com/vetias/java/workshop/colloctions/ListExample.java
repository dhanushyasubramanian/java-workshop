import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("dhanushya");
        names.add("roshan");
        names.add("kirthik");
        names.add("mounika");
        names.add("sanjana");
        names.add("zaraa");

        System.out.println(names);
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i}