
public class Whatsapp {
	public  void sendMessage() {
		System.out.println("Sending simple message");
	}
	
	
	
	public void sendMessage(String name) {
		System.out.println("sending mesage to"+ name);
	}
	
	
	
	public void sendMessage(String name, String emoji) {
		System.out.println("Sending message to"+ name + ""+ emoji);
	}
}
