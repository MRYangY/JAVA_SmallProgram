import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		System.out.println("------猜拳游戏------");
		System.out.println("请出拳（1.剪刀 2.石头 3.布）~~");
		Scanner in=new Scanner(System.in);
		int player=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String marks1="游戏";
		String marks2="游戏";
		switch(player){
			case 1:
				marks1="剪刀";
				break;
			case 2:
				marks1="石头";
				break;
			case 3:
				marks1="布";
				break;
		}
		switch(computer){
			case 1:
				marks2="剪刀";
				break;
			case 2:
				marks2="石头";
				break;
			case 3:	
				marks2="布";
				break;	
		}
		if(player==computer){
			System.out.println("你出的是："+marks1+"电脑出的是："+marks2+"~,~平局");
		}else if(player==1&&computer==2||player==2&&computer==3||player==3&&computer==1){
			System.out.println("你出的是："+marks1+"电脑出的是："+marks2+"T-T电脑赢");
		}else{
			System.out.println("你出的是："+marks1+"电脑出的是："+marks2+"^-^玩家赢");
		}
	}
}