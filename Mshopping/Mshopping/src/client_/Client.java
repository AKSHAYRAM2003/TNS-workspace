package client_;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
	GSShopFactory shop = new GSShopFactory();
	GSNormalAcc customer1 = (GSNormalAcc) shop.getNewNormalAccount(1, "MONISH", 20000, 1000);
	customer1.bookProduct(5000);
	System.out.println(customer1.getCharges());
	
	GSPrimeAcc prime_customer1 = (GSPrimeAcc) shop.getNewPrimeAccount(1, "SHELBY", 500000, true);
	prime_customer1.bookProduct(40000);
//	System.out.println(prime_customer1.getCharges());
	}

}
