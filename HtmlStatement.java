import java.util.Enumeration;

public class HtmlStatement extends Statement {
    private String createHeader(String name){
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    private String createBody(String title, Double charge){
        return title + ": " + String.valueOf(charge) + "<BR>\n";
    }

    private String createFooter(double totalCharge, int renterPoints){
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n" +
            "On this rental you earned <EM>" + String.valueOf(renterPoints) +
            "</EM> frequent renter points<P>";
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