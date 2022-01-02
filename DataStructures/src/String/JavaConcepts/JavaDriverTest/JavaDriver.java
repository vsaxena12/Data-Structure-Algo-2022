package JavaDriverTest;

class TestMethod
{
	void setter()
	{
		System.out.println("Test");
	}
	
	void getter()
	{
		setter();
	}
}

public class JavaDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JavaDriver driver = new JavaDriver();
		//TestMethod.fun();
		TestMethod method = new TestMethod();
		method.getter();	
	}

}
