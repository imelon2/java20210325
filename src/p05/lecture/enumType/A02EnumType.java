package p05.lecture.enumType;

public class A02EnumType {
	public static void main(String[] args) {
		String s = "VALUE1";
		
		switch (s) {
		case "VALUE1" :
			System.out.println("Value1 호출");
			break;
		case "VALUE2":
			System.out.println("Value2 호출");
		default:
			System.out.println("둘 다 아닙니다.");
			break;
		}
		
		System.out.println("enum type");
		MyEnum e1 = MyEnum.VALUE1;
		
		switch (e1) {
		case VALUE1:
			System.out.println("valeu1 호출");
			break;
		case VALUE2:
			System.out.println("value2 호출");

		default:
			System.out.println("둘다 아닙니다.");
			break;
		}
	}
}
