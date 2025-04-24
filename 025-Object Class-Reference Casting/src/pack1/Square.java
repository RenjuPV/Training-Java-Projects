package pack1;

public class Square {
	int size;

	public Square(int size) {
		
		this.size = size;
	}

	public Square() {
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getArea() {
		return size*size;
		
	}

}
