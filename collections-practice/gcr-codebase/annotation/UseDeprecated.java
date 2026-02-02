package collectiontwo;

class LegacyAPI {
	@Deprecated
	public static void oldFeature() {
		System.out.println("This is old method");
	}
	public static void newFeature() {
		System.out.println("This is new method");
	}
}
public class UseDeprecated {
	public static void main(String[] args) {
		LegacyAPI api1 = new LegacyAPI();
		
		api1.oldFeature();
		api1.newFeature();
	}
	

}
