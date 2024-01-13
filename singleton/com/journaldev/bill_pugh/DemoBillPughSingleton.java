package singleton.com.journaldev.bill_pugh;

public class DemoBillPughSingleton {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        BillPughSingleton anotherBillPughSingleton = BillPughSingleton.getInstance();

        System.out.println(billPughSingleton.hashCode());
        System.out.println(anotherBillPughSingleton.hashCode());
    }
}
