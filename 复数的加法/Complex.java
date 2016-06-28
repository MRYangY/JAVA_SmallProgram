
public class Complex {
	private int fs;//复数的实部
	private int fx;//复数的虚部
	/**
	 * 有参构造方法
	 * @param fs
	 * @param fx
	 */
	public Complex(int fs, int fx) {
		super();
		this.fs = fs;
		this.fx = fx;
	}
	/**
	 * 无参构造方法
	 */
	public Complex(){
		
	}
	public int getFs() {
		return fs;
	}
	public void setFs(int fs) {
		this.fs = fs;
	}
	public int getFx() {
		return fx;
	}
	public void setFx(int fx) {
		this.fx = fx;
	}
	
}
