package fundamentals;

public class DotNotation {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Good Morning X";
        s = s.replace("X", "Madam");
        s = s.toUpperCase();
        s = s.concat("!!!!");
        System.out.println(s);

        System.out.println("Paulo".toUpperCase());

        String y  = "Good Morning X"
                .replace("X", "Henrique")
                .toUpperCase().concat("!!!!");
        System.out.println(y);

    }
}
