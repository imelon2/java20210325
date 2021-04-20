package p10.textbook.s100203;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Interger.parseInt(data1);
		int value2 = Interger.parseInt(data2);
	}
}
