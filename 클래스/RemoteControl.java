
// interface 
public interface RemoteControl {

	int MAX_VOLUME = 10; // public static final 생략 
	public int MIN_VOLUME = 0;
	
	// 추상(abstract) 메소드(Method)
	void turnOn(); //public abstract 숨겨짐 
	void turnOff(); 
	void setVolume(int volume);
}
