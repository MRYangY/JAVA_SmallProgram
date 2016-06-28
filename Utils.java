public class Utils {
	private int result_f1;
	private int result_f2;
	Score score3=new Score();
//	
//	public Score getScore3() {
//		return score3;
//	}
//
//	public void setScore3(Score score3) {
//		this.score3 = score3;
//	}

	public Score add(Score score1,Score score2){
		if(score1.getF2()==score2.getF2()){
			result_f1 = score1.getF1()+score2.getF1();
			result_f2 = score1.getF2();
		}else{
			result_f1=score1.getF1()*score2.getF2()+score2.getF1()*score1.getF2();
			result_f2=score1.getF2()*score2.getF2();
		}
		score3.setF1(result_f1);
		score3.setF2(result_f2);
		return score3;
	}
	public Score sub(Score score1,Score score2){
		if(score1.getF2()==score2.getF2()){
			result_f1=score1.getF1()-score2.getF1();
			result_f2=score1.getF2();
		}else{
			result_f1=score1.getF1()*score2.getF2()-score2.getF1()*score1.getF2();
			result_f2=score1.getF2()*score2.getF2();
		}
		score3.setF1(result_f1);
		score3.setF2(result_f2);
		return score3;
	}
	public Score chen(Score score1,Score score2){
		result_f1=score1.getF1()*score2.getF1();
		result_f2=score1.getF2()*score2.getF2();
		score3.setF1(result_f1);
		score3.setF2(result_f2);
		return score3;
	}
	public Score chu(Score score1,Score score2){
		result_f1=score1.getF1()*score2.getF2();
		result_f2=score1.getF2()*score2.getF1();
		score3.setF1(result_f1);
		score3.setF2(result_f2);
		return score3;
	}
	
}
