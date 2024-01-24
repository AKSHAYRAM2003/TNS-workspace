package framework;

public abstract class PrimeAcc extends ShopAcc{
private boolean isPrime;
private final static int MINBAL = 5000;
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		// TODO Auto-generated constructor stub
	}
	public boolean isPrime() {
		return isPrime;
	}
	public static float getMINBAL() {
		return MINBAL;
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
}
