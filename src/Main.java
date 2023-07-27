import java.time.LocalDate;

public class Main {

    public static void learYear ( ) {
        System.out.println("7777777777777777777777777");
    }
    public static void main(String[] args) {
        learYear();
        int currentYear = LocalDate.now().getYear();
        learYear() ;
        System.out.println(currentYear);
        learYear() ;
    }

    }

