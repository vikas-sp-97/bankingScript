package banking;
import java.sql.Date;
import java.util.Date.*;

public class Main {
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(12345, "Mark", Date.valueOf("2000-12-12"));
        System.out.println(sa);

        sa.depositAmount(1000);
        sa.withdrawAmount(200);
        sa.checkBalance();
    }
}
