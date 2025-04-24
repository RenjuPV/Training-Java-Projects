
public class Square {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size<0) {
			System.out.println("Invalid size");
			return;
		}
		this.size = size;
	}
	

}
