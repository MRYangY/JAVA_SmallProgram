
public class ComAdd {
	private int result_fs;
	private int result_fx;
	Complex com=new Complex();
	public Complex Add(Complex com1,Complex com2){
		result_fs=com1.getFs()+com2.getFs();
		result_fx=com1.getFx()+com2.getFx();
		com.setFs(result_fs);
		com.setFx(result_fx);
		return com;
	}
}
