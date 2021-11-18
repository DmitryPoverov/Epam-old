package by.epam.lesson1;

public class BusinessTrip {

    public static final int RATE = 700;
    private String account;
    private int transport;
    private int days;

    public BusinessTrip() {
    }

    public BusinessTrip(String account, int transport, int days) {
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getTotal() {
        return ((RATE * days)+transport)/0.01;
    }

    public void show() {
        System.out.println("rate=" + RATE*0.01);
        System.out.println("account=" + account);
        System.out.println("transport" + transport/0.01);
        System.out.println(getTotal());
    }

    @Override
    public String toString() {
        return account  + ";" + days + ";" + transport*0.01 + ";" + getTotal();
    }
}
