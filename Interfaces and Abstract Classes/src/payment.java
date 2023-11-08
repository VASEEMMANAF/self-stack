public interface payment {
   void  processpayment();
   void Generatereciept();
}
class creaditcardpayment implements payment{

    {

    } @Override
        public void processpayment() {
        System.out.println("creaditcard payment processing");
    }

        @Override
        public void Generatereciept() {
        System.out.println("creaditcard reciept Generating");
    }



}
class paypalpayment implements payment{
    @Override
    public void processpayment() {
        System.out.println("paypal payment processing");
    }

    @Override
    public void Generatereciept() {
        System.out.println("paypal reciept Generating");
    }
}
