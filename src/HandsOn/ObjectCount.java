package HandsOn;

public class ObjectCount {

	public static void main(String[] args) {
		Sample s1=new Sample();
		s1.count();
		Sample s2=new Sample();
		s2.count();
		Sample s3=new Sample();
		s3.count();
		Sample s4=new Sample();
		s4.count();
		Sample s5=new Sample();
		s5.count();
		Sample s6=new Sample();
		s6.count();
		System.out.println("no of ojects:"+Sample.count);

	}

}

class Sample{
	static int count;
	void count() {
		count++;
		
	}
}

