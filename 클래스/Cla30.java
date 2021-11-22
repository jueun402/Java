
interface Vehicle{	void run();}

class Bus implements Vehicle{
	public void run() {System.out.println("Bus가 달립니다");};
}
class Taxi implements Vehicle{
	public void run() {System.out.println("Taxi가 달립니다");};
}

class Tada implements Vehicle{
	public void run() {System.out.println("Tada가 달립니다");};
}

class Driver { void drive(Vehicle v) {v.run();}}

public class Cla30 {

	public static void main(String[] args) {
		
		// 구현 개체 
//		Driver driver01 = new Driver();
//		
//		driver01.drive(new Bus());
//		driver01.drive(new Taxi());
//		driver01.drive(new Tada());

		Vehicle[] vArr = {new Taxi(), new Bus(), new Tada()};
		Driver driverNew = new Driver();
		
		for(Vehicle ve :vArr) {driverNew.drive(ve);}
		
		
}

}
