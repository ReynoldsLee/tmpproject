public class object1 {
	public static void main(String [] args) {
		// �տ��� �õ��� ���� �ż����� Ŭ���� �̸��� �ҽ����� �̸��� ��ġ�ؾ߸� �Ѵ�.
		Tv t;
		t= new Tv();
		t.channel =7;
		t.channeldown();
		t.channeldown();
		t.channeldown();

		System.out.println("���� ä����"+t.channel+"�Դϴ�");
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
