package week1.day1;

public class Car { 
	public void applyBreak() {
		System.out.println("Apply Break");
	}
    public void SoundHorn() {
    	System.out.println("Sound Horn");
    }
    public void turnonAc( ) {
    	System.out.println("Turn On AC");
    }
    public static void main(String[] args) {
		Car bmw = new Car();
		bmw.applyBreak();
		bmw.SoundHorn();
		bmw.turnonAc();
	}
}
