
public class SmartHomeLights {
	public static void main(String[] args) {
		Runnable motion = () -> System.out.println("Motion detected : Lights on");
		
		Runnable night = () -> System.out.println("Night time : Dim lights");
		
		Runnable voice = () -> System.out.println("Voice command : living room lights on ");
		
		motion.run();
		night.run();
		voice.run();
	}

}
