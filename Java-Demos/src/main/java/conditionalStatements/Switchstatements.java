package conditionalStatements;

public class Switchstatements {

    /*
    how it works
    the expression is evaluated once
    the value of the expression is compared with the values of each case
    if a match is found, the statements in the case are executed
     */
    public static void main(String[] args) {
        int number = 29;
        String size = null;

        switch (number) {
            case 29:
                size = "small";
                break;
            case 42:
                size = "medium";
                break;
            case 44:
                size = "large";
                break;
            case 48:
                size = "extra large";
                break;
            default:
                size = "unknown";
        }

        System.out.println("size: " + size);
    }
    
}
