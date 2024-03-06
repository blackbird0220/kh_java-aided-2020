package exam3;

public class ExamCard {
	private int carNumber;
	private static int serialNumber = 1000;
	Card( ) {
		serialNumber++;
		cardNumber = serialNumber;
		}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public static int getSerialNumber() {
		return serialNumber;
	}
	public static void setSerialNumber(int serialNumber) {
		ExamCard.serialNumber = serialNumber;
	}

}

