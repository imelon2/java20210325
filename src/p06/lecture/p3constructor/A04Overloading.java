package p06.lecture.p3constructor;
 // 생성자 오버로딩 : 여러개 만드는 일
public class A04Overloading {
	public static void main(String[] args) {
		Computer com1 = new Computer("dell", 4, "intel", 123);
		Computer com2 = new Computer("hp", 8, "amd", 256 );
		
		Computer com3 = new Computer("lenovo", 8, "intel");
		Computer com4 = new  Computer("ms", 16);
		System.out.println(com3.ssd);
		
		System.out.println(com4.cpu);
		System.out.println(com4.ssd);
	}
	
	
	
}
