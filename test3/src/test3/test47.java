package test3;

public class test47 {
	public static void main(String[] args)
	{ 
		
		Car16 car1;
		car1=new Car16();
		
		car1.show();
		
		int number=1234;
		double gasoline=20.5; 
		String str="1����";
	
		car1.setCar(number, gasoline);
		car1.SetName(str);
		
		car1.show();
	}
}
class Car16{
	private int num;
	private double gas;
	private String name ;

	public Car16()
	{
			num=0;
			gas=0.0;
			name="�S���W��";
			System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	
	public void SetName(String nm)
	{
		name =nm;
		System.out.println("�N���W�]��"+name);
	}
	public void show()
	{
		System.out.println("�����O"+ num );
		System.out.println("�T�o�q�O"+ gas );
		System.out.println("���W�O"+ name );
	}
}

