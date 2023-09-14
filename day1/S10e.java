package week1.day1;

public class S10e {
	public void sendMessage() {
		System.out.println("send Messasge");
	}
    public void shareDocument() {
    	System.out.println("share Document");
    }
    public void makeCall() {
    	System.out.println("make Call");
    }
    public static void main(String[] args) {
		S10e model = new S10e();
		model.sendMessage();
		model.shareDocument();
		model.makeCall();
	}
}
