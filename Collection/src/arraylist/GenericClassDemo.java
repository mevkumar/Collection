package arraylist;

class Sample<T>{//parameterized class
	private T data;//generic variable 

	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample<String> s1=new Sample<String>("Java Generic");//object generic class
		System.out.println("Display From Generic class by passing String Object:"+s1.getData());
		Sample<Integer> s=new Sample<Integer>(100);
		System.out.println("Display From Generic class by passing String Object:"+s.getData());
		Sample<Double> s2=new Sample<Double>(100.50);
		System.out.println("Display From Generic class by passing String Object:"+s2.getData());
	}

}
