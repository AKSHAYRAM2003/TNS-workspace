package application;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	@Override
	public void bookProduct(float amt) {
		// TODO Auto-generated method stub
		int accBal = (int) (this.getCharges());
		if((accBal-amt)>this.getMINBAL()) {
			int newBal = (int) (accBal-amt);
			System.out.println("After the purchase of the product Balance is"+newBal);
			this.setCharges(newBal);
		}else {
			System.out.println("Insufficent Funds");
		}
		
	}

	@Override
	public void item(float amt) {
		
	}
	

}
