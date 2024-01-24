package application;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return new GSPrimeAcc(accNo,accNm,charges,isPrime);
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
		// TODO Auto-generated method stub
		return new GSNormalAcc(accNo,accNm,charges,deliveryCharge);
	}

}
