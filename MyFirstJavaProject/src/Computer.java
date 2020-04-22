
public class Computer {
	// Access Modifier
	// public : private
	private String type;
	private String brand;
	private int ramSize;

	public Computer(String type, String brand, int ramSize) {
		this.type = type;
		this.brand = brand;
		this.ramSize = ramSize;
	}

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public int getRamSize() {
		return ramSize;
	}

	// public Computer(String type , String brand , int ramSize) {
	// this.type = type;
	// this.brand = brand;
	// this.ramSize =ramSize;
	// }

	// public String getType() {
	// return type;
	// }
	//
	// public String getBrand() {
	// return brand;
	// }
	//
	// public int getRamSize() {
	// return ramSize;
	// }
	
	public String toString() {
		return "[type"+type +"," + "brand "+brand + ","+"ram "+ramSize+"]";
	}

}
