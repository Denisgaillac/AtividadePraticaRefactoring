import java.util.Enumeration;

public class TextStatement extends Statement {
    private String createHeader(String name){
        return "Rental Record for " + name +
        "\n";
    }

    private String createBody(String title, Double charge){
        return "\t" + title+ "\t" + String.valueOf(charge) + "\n";
    }

    private String createFooter(double totalCharge, int renterPoints){
        return "Amount owed is " + String.valueOf(totalCharge) + "\n" +
            "You earned " + String.valueOf(renterPoints) 
            + " frequent renter points";
    }
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = createHeader(aCustomer.getName());
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for this rental
           result += createBody(each.getMovie().getTitle(),
                each.getCharge());
        }
        //add footer lines
        result += createFooter(aCustomer.getTotalCharge(),
            aCustomer.getTotalFrequentRenterPoints());
        return result;
     }
}
