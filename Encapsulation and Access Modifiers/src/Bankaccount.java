public class Bankaccount {
    private String Ownername;
    private int accountnumber;
    private int balance;

    public String getOwnername() {
        return Ownername;
    }

    public void setOwnername(String ownername) {
        Ownername = ownername;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
     public int widrawal(int widrawal) {
       balance=balance-widrawal;
       return balance;
    }
}
