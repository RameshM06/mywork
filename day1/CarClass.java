package week1.day1;

public class CarClass {
	public void applyGear() {
		System.out.println("Apply Gear");
	}
    public void switchOnAc() {
    	System.out.println("Switch On AC");
    }
    public void applyAcclerate() {
    	System.out.println("Apply Acclerate");
    }
    public static void main(String[] args) {
		CarClass audi = new CarClass();
		audi.applyGear();
		audi.switchOnAc();
		audi.applyAcclerate();
	}
}
