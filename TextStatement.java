public class TextStatement extends Statement {
    protected String createHeader(String name){
        return "Rental Record for " + name +
        "\n";
    }

    protected String createBody(String title, Double charge){
        return "\t" + title+ "\t" + String.valueOf(charge) + "\n";
    }

    protected String createFooter(double totalCharge, int renterPoints){
        return "Amount owed is " + String.valueOf(totalCharge) + "\n" +
            "You earned " + String.valueOf(renterPoints) 
            + " frequent renter points";
    }
}
