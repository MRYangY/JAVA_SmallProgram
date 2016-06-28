import java.util.Random;
public class Test {
	private static ComAdd ca;
	private static Random rm;
	private static int i;
	private static int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ca = new ComAdd();
		rm = new Random();
		i = rm.nextInt(100);//实部
		j = rm.nextInt(100);//虚部
		int n=3;
		Complex cp=addn(n);
		System.out.println("复数为："+cp.getFs()+"+"+cp.getFx()+"i");
	}
	public static Complex addn(int x){
		Complex result=new Complex();
		if(x==2){
			Complex com1=new Complex(i, j);
			Complex com2=new Complex(i, j);
			return ca.Add(com1, com2);
		}else{
			Complex comx=new Complex(i, j);
			result=ca.Add(comx, addn(x-1));
		}
		return result;
	}
}
