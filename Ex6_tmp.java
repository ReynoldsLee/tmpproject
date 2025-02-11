import javax.jws.soap.SOAPBinding;

class Tv1{
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


public class Ex6_tmp {
	int [] a = {1,2,3};
	Tv1 [] tvarrTv1s = {new Tv1(), new Tv1(), new Tv1()};


}

