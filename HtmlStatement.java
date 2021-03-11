public class HtmlStatement extends Statement {
    protected String createHeader(String name){
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    protected String createBody(String title, Double charge){
        return title + ": " + String.valueOf(charge) + "<BR>\n";
    }

    protected String createFooter(double totalCharge, int renterPoints){
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n" +
            "On this rental you earned <EM>" + String.valueOf(renterPoints) +
            "</EM> frequent renter points<P>";
    }
}