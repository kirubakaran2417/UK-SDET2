package conditionalStatements;

public class IfelseIFLadder {

    public static void main(String[] args) {

        int age = 21;

        if (age >= 18) {
            System.out.println("eligible to vote");
        } else if (age >= 35 && age <= 40) {
            System.out.println("eligible to work");
        }else if (age >=40) {
            System.out.println("eligible to marry");
        }else {
            System.out.println("eligible to retire");
        }

    }


}
