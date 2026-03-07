package oops.notPolymorphism.Variable;

public class VariableShadowing {

//	int x = 10;
	static int y = 30;
	
	void show() {
//		int x = 20;
//		System.out.println(x);
//		System.out.println(this.x);
		
		int y = 40;
		System.out.println(y);
		System.out.println(this.y); 			// Why?
		System.out.println(VariableShadowing.y);
	}
	
	public static void main(String[] args) {
		new VariableShadowing().show();
	}

}
