package enumerator.example.day;

public enum Day {
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7);
	
	private final int dayNum;
	
	private Day(int dayNum) { 	// Only private and default allowed
		this.dayNum = dayNum;
//		main(null);
	}
	
	public int getDayNum() {
		return dayNum;
	}
	
	public int getDayNum(Day day) {
		return day.getDayNum();
	}
	
//	public static final void main(String[] args) {
//		System.out.println("Yippie!");
//	}
}
