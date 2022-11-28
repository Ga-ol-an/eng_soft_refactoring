public abstract class Statement {

    public abstract String value(Customer aCustomer);

    public abstract String writeHeader(Customer aCustomer);

    public abstract String writeRental(Rental aRental);

    public abstract String writeFooter(Customer aCustomer);
}
