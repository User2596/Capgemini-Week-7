package firstProject;

public class Demo8 {
	static final int num = 7;
	public static void main(String[] args) {
		starPrinter(5);
	}
	
	public static void starPrinter(int count, int current) {
		if (count > current) {
			for(int _i=0; _i<current; _i++) System.out.print("* ");
			for(int _i=current*2; _i<count*2-1; _i++) System.out.print("  ");
			for(int _i=0; _i<current; _i++) System.out.print("* ");
			System.out.println();
			starPrinter(count, ++current);
		}
		else if (count == current) {
			for(int _i=0; _i<count*2-1; _i++) System.out.print("* ");
			System.out.println();
			starPrinter(count, ++current);
		}
		else if (2*count > current) {
			for(int _i=0; _i<count*2-current; _i++) System.out.print("* ");
			for(int _i=current*2; _i>count*2+1; _i--) System.out.print("  ");
			for(int _i=0; _i<count*2-current; _i++) System.out.print("* ");
			System.out.println();
			starPrinter(count, ++current);
		}
	}
	public static void starPrinter(int finalCount) {
		starPrinter(finalCount, 1);
	}
}