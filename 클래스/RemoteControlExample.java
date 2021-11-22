
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		RemoteControl[] rcArr = {new Television(), new Audio()};
		for (RemoteControl ra:rcArr) {ra.turnOn(); ra.setVolume(7);ra.turnOff();}

	}
}
