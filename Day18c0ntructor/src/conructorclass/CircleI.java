package conructorclass;

public class CircleI {
	float areaOfCirclce(float pi,float radius)
	{
		return(pi*radius*radius);
	}
	float circumOfCircle(float radius)
	{
		return(2*3.5f*radius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleI c1=new CircleI();
		System.out.println("Area is:"+c1.areaOfCirclce(3.5f,12 ));
System.out.println("circumperence is:"+c1.circumOfCircle(4));
	}

}
