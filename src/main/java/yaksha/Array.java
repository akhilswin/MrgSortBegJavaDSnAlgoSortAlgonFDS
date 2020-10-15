package yaksha;

public class Array {

	private int array[];
	private int beg;
	private int mid;
	private int end;

	public Array(int[] array, int beg, int mid, int end) {
		super();
		this.array = array;
		this.beg = beg;
		this.mid = mid;
		this.end = end;
	}

	public Array(int[] array, int beg, int end) {
		super();
		this.array = array;
		this.beg = beg;
		this.end = end;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getBeg() {
		return beg;
	}

	public void setBeg(int beg) {
		this.beg = beg;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
