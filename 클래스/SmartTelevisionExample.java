public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn(); //RemoteControl
		tv.setVolume(4); //RemoteControl
		tv.search("www.daum.net"); //Searchable
		tv.turnOff(); //RemoteControl
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
