package pack1;

public class Square {

	final private int size;

	public Square(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public int getArea() {
		return this.size * this.size;
	}

	@Override
	public String toString() {
		return "Square [size=" + size + ", getSize()=" + getSize() + ", getArea()=" + getArea() + "]";
	}

	public Square enLarge(int bySize) {

		// this.size=this.size+bySize; //we can not reinitialize final variable

		Square temp = new Square(this.size + bySize);
		return temp;
	}

}
