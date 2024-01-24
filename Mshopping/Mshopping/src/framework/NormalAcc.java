package framework;

public abstract class NormalAcc extends ShopAcc{
	private static final float deliveryCharge = 100.00f;
	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
	}
	
}
