package application;

import framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges,float deliveryCharge) {
		super(accNo, accNm, charges,deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bookProduct(float amt) {
		int accBal=(int) (this.getCharges());
		int newBal=(int) (accBal-(amt+getDeliveryCharge()));
		System.out.println("After purchase of the product the Balance is"+newBal);
		this.setCharges(newBal);
	}

	@Override
	public void item(float amt) {
		// TODO Auto-generated method stub
		
	}

}
