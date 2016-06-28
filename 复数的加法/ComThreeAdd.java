
public class ComThreeAdd extends ComAdd {
	public Complex AddThree(Complex com1,Complex com2,Complex com3){
		return super.Add(super.Add(com1, com2), com3);	
	}
}
