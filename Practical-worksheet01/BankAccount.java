class BankAccount {
	private String accountHolderName;
	private double balance;
 
	public BankAccount(String accountHolderName,double balance){
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	public String getaccountHolderName(){
		return accountHolderName;
	}
	
	public void setaccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void setbalance(double balance){
		if(balance>=0){
			this.balance=balance;
		}
		else{
			System.out.println("Balance cannot be negative");
		}
	}
	
	public void deposit(double amount) {
		if(amount>0){
			balance+=amount;
			System.out.println("deposited rs"+amount);
		}
		else{
			System.out.println("deposit amount must be positive");
		}
	}
 
 
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance){
			balance-=amount;
			System.out.println("withrawed rs"+amount);
		}
		else{
			System.out.println("insufficient balance or invalid amount");
		}
	}
 
 
	public void displayBalance() {
		System.out.println(accountHolderName+"'s current balance rs"+balance);
	}
 
	public static void main(String[] args){
	BankAccount account = new BankAccount("shahnaz",5000.0);
	account.deposit(5000);
	account.withdraw(1500);
	account.displayBalance();
	}
 }
  