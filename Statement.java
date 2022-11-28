import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();

        String result = writeHeader(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += writeRental(each);
        }
        // add footer lines
        result += writeFooter(aCustomer);
        return result;
    }

    public abstract String writeHeader(Customer aCustomer);

    public abstract String writeRental(Rental aRental);

    public abstract String writeFooter(Customer aCustomer);
}
