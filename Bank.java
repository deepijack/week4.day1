package week4.day1;

public class Bank extends SBILoan implements CIBIL,PNB {
	

	
	@Override
	public void bankBalance() {
		System.out.println("60000");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("30000");		
	}

	@Override
	public void creditScore() {
		System.out.println("15");
		
	}

	@Override
	public void minimumBalance() {
		System.out.println("1500");
		
	}

	@Override
	public void cibilScore() {
		System.out.println("2500");
		
	}
	public static void main(String[] args) {
		
		Bank sc=new Bank();
		sc.bankBalance();
		sc.maximumLoanAmount();
		sc.SBIITLoan();
		
		CIBIL cb=new Bank();
		cb.cibilScore();
		
		PNB val=new Bank();
		val.maximumLoanAmount();
		val.creditScore();
		val.minimumBalance();
		
		
		
	}


}
