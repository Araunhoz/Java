package fundamentals;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Hello guys".charAt(2));

        String s = "Good Afternoon";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Good"));
        System.out.println(s.toLowerCase().startsWith("good"));
        System.out.println(s.toUpperCase().endsWith("AFTERNOON"));
        System.out.println(s.length());
        System.out.println(s.equals("good afternoon"));
        System.out.println(s.equalsIgnoreCase("good afternoon"));

        var name = "Pedro";
        var lastname = "Santos";
        var age = 33;
        var salary = 12345.987;

        System.out.println("Name: " + name + "\nLastname: " + lastname + "\nAge:" + age + "\nsalary:" + salary);
        System.out.printf("You are %s %s and are %d years old and earn $%.2f",name,lastname,age, salary);

        String phrase = String.format("\nYou are %s %s and are %d years old and earn $%.2f",name,lastname,age, salary);
        System.out.println(phrase);

        System.out.println("Any Sentence".concat("Any"));
        System.out.println("Any Sentence".indexOf("Any"));
        System.out.println("Any Sentence".substring(6));
        System.out.println("Any Sentence".substring(6,10));
        

    }
}
