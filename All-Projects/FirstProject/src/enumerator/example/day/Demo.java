package enumerator.example.day;

public class Demo {
	static Day day;
	public static void main(String[] args) {
		System.out.println(day);
		
		day = Day.FRIDAY;
		System.out.println(day);
		
		day = Day.values()[3];
		System.out.println(day);
		System.out.println(day.ordinal());
		
		day.getDayNum();
		day.getDayNum(Day.THURSDAY);
		
		day = Day.valueOf("MONDAY");
		System.out.println(day);
		day = Day.valueOf(Day.class, "TUESDAY");
		
//		System.out.println(day.describeConstable());
		System.out.println();
		
		for (Day d : Day.values()) {
			System.out.println(d);
		}
		System.out.println();
		
		for (int i=0; i<Day.values().length; i++) {
			System.out.println(Day.values()[i]);
		}
	}
}
