import org.joda.time.LocalTime;

public class Main {

    public static void main(String[]args) {
        var currentTime = new LocalTime();
        System.out.println("==============Current Local Time: "+currentTime+"================");
        printInvoice();
    }

    public static void printInvoice() {
        System.out.println("----------------------------INVOICE---------------------------");
        System.out.println("NIT:__________________________________________________________");
        System.out.println("DATE:_________________________________________________________");
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("ITEM                    PRICE           QTY          SUB TOTAL");
        System.out.println("--------------------------------------------------------------");
        //HERE should display all the items
        System.out.println("--------------------------------------------------------------");
        System.out.println("----------------------------------------------TOTAL:          ");
        System.out.println("--------------------------------------------------------------");
    }

}
