package fundamentals;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // About employee

        //numerical types integer
        byte yearOfCompany = 23;
        short numberOfFlies = 542;
        int id = 56789;
        long accumulatedPoints = 3_134_845_223L;

        // numerical types real
        float salary = 11_445.44F;
        double accumulatedSales = 2_991_797_103.01;

        // type boolean
        boolean isOnVacation = false;

        // type character
        char status  = 'A';

        //Days of Company
        System.out.println("Year of company: " + yearOfCompany * 365);
        //Number of trip
        System.out.println("Number of Flies: " + numberOfFlies / 2);

        // Points of sales
        System.out.println("Points of Sales: " + accumulatedPoints / accumulatedSales);

        System.out.println(id + ": Receive -> "+ salary);
        System.out.println("Vacation?"+ isOnVacation);
        System.out.println("Status: " + status);

    }
}
