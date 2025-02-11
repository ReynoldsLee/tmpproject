public class object1 {
	public static void main(String [] args) {
		// 앞에서 봤듯이 메인 매서드의 클래스 이름이 소스파일 이름과 일치해야만 한다.
		Tv t;
		t= new Tv();
		t.channel =7;
		t.channeldown();
		t.channeldown();
		t.channeldown();

		System.out.println("현재 채널은"+t.channel+"입니다");
	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelup() {
		++channel;
	}
	void channeldown() {
		--channel;
	}
}
