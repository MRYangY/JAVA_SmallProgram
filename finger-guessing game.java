import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		System.out.println("------��ȭ��Ϸ------");
		System.out.println("���ȭ��1.���� 2.ʯͷ 3.����~~");
		Scanner in=new Scanner(System.in);
		int player=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String marks1="��Ϸ";
		String marks2="��Ϸ";
		switch(player){
			case 1:
				marks1="����";
				break;
			case 2:
				marks1="ʯͷ";
				break;
			case 3:
				marks1="��";
				break;
		}
		switch(computer){
			case 1:
				marks2="����";
				break;
			case 2:
				marks2="ʯͷ";
				break;
			case 3:	
				marks2="��";
				break;	
		}
		if(player==computer){
			System.out.println("������ǣ�"+marks1+"���Գ����ǣ�"+marks2+"~,~ƽ��");
		}else if(player==1&&computer==2||player==2&&computer==3||player==3&&computer==1){
			System.out.println("������ǣ�"+marks1+"���Գ����ǣ�"+marks2+"T-T����Ӯ");
		}else{
			System.out.println("������ǣ�"+marks1+"���Գ����ǣ�"+marks2+"^-^���Ӯ");
		}
	}
}