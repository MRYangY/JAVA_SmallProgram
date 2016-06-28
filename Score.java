public class Score {
	private int f1;//f1是分子
	private int f2;//f2是分母
	public int getF1() {
		return f1;
	}
	public void setF1(int f1) {
		this.f1 = f1;
	}
	public int getF2() {
		return f2;
	}
	public void setF2(int f2) {
		this.f2 = f2;
	}
	public Score(int f1, int f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
	public Score(){
		
	}
}