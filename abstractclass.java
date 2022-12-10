abstract class RRPaymentServices{
public double balance;
public int customerId;

public RRPaymentServices(double balance, int customerId) {
this.balance = balance;
this.customerId = customerId;
}

public void setBalance(double balance) {
this.balance = balance;
}

public double getBalance() {
return balance;
}

public int getCustomerId() {
return customerId;
}
public abstract void payBill(double amount);
}
class ShoppingPayment extends RRPaymentServices{
public static int counter=101;
public String paymentId;
public ShoppingPayment(double balance,int customerId){
super(balance,customerId);
}

public String getPaymentId() {
return paymentId;
}
public void payBill(double amount){
if(amount==getBalance()){
paymentId="S"+counter;
System.out.println("Congratulations!! Your payment of Rs."+getBalance()+" is successful! with payment id "+paymentId);
}
else if(amount>getBalance()){
System.out.println("Excess amount entered !! Please try again.");
}
else{
System.out.println("Insufficient amount entered!!please try again.");
}
counter++;
}
}
