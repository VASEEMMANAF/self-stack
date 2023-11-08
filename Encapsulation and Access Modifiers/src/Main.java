import jdk.swing.interop.SwingInterOpUtils;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Bankaccount b1=new Bankaccount();
        b1.setOwnername("manaf");
        b1.setBalance(10000);
        System.out.println("Name: "+b1.getOwnername());
        System.out.println("balance:"+b1.getBalance());
        b1.widrawal(2000);
        System.out.println("widrawed cash");
        System.out.println("balance: "+b1.getBalance());

    }
}