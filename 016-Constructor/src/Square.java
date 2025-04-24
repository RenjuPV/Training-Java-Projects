
public class Square {
	private int size;

	public Square(int size) {
		this.size = size;
		System.out.println("Object is created with size " + size);
	}

	public Square() {
		System.out.println("Object is created ");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size < 0) {
			System.out.println("Invalid size");
			return;
		}
		this.size = size;
	}

}
