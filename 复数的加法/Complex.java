
public class Complex {
	private int fs;//������ʵ��
	private int fx;//�������鲿
	/**
	 * �вι��췽��
	 * @param fs
	 * @param fx
	 */
	public Complex(int fs, int fx) {
		super();
		this.fs = fs;
		this.fx = fx;
	}
	/**
	 * �޲ι��췽��
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
