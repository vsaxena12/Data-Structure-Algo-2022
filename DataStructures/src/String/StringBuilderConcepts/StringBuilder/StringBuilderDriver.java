package StringBuilder;

class StringBuilderDemo
{
	public void append() {
		StringBuilder sb = new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
	}
	
	public void insert()
	{
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
	}
	
	public void replace()
	{
		StringBuilder sb=new StringBuilder("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
	}
	
	public void delete()
	{
		StringBuilder sb=new StringBuilder("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);
	}
	
	public void reverse()
	{
		StringBuilder sb=new StringBuilder("Hello");  
		sb.reverse();  
		System.out.println(sb);//prints olleH  
	}
	
	public void capacity()
	{
		StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (old capacity*2)+2  
	}
	
	public void ensureCapacity()
	{
		StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (old capacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  

	}
}

public class StringBuilderDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilderDemo stringBuilder = new StringBuilderDemo();
		stringBuilder.append();
		stringBuilder.insert();
		stringBuilder.replace();
		stringBuilder.delete();
		stringBuilder.reverse();
		stringBuilder.capacity();
		stringBuilder.ensureCapacity();
	}

}
