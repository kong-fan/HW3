package test3;

public class test17 {
	public static void main(String[] args)
	{
		Car8 car1;
		car1=new Car8();
		car1.setNumGas(1234, 20.5);
		int number=car1.getNum();
		double gasoline=car1.setGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O"+number+"�T�o�q�O"+gasoline);
	}
}
class Car8{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	double setGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+ num +"�A�N�T�o�q�]��"+gas);
	}
}

