package javapractice;
public class FlipCoin {

	public static final int IS_HEAD=1;
	
	public static void main(String [] args){
		Flip();
	}
	
	public static void Flip(){	
		double ranNumber = Math.floor(Math.random() * 10) % 2;
		
		if(IS_HEAD == ranNumber){
			System.out.println("Head");
		}else{
			System.out.println("Tail");
		}
	}
}