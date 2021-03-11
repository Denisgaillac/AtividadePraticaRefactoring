import java.util.Enumeration;

public abstract class Statement {
    protected abstract String createHeader(String name);

    protected abstract String createBody(String title, Double charge);

    protected abstract String createFooter(double totalCharge, int renterPoints);

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
