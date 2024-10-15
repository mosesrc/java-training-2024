class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) {
        if(!this.currency.equals(that.currency)) {
            throw new RuntimeException("Currencies Don't Match");
        }

        this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

public class ExceptionHandlingRunner2 {

    public static void main(String[] args) {
//        method1();
//        System.out.println("Main ended");

        Amount amount1 = new Amount ("USD", 10);
        Amount amount2 = new Amount ("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        try {
            String str = null;
            str.length();
            System.out.println("Method2 Ended");
        } catch (NullPointerException err) {
            System.out.println("NullPointerException");
            err.printStackTrace();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
