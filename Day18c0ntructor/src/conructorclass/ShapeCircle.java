package conructorclass;

public class ShapeCircle {
float pi=3.5f,radius;   //    (vvip note)class [ circle and area] part of Shape circle class



ShapeCircle(float radius)
{
	this(2,3.5f);
	this.radius=radius;
	System.out.println("1 st constructor---> area"+(pi*radius*radius));
}

ShapeCircle(float radius,float pi)
{
	this.radius=radius;
	System.out.println("2nd constructor---> area"+(pi*radius*radius));
}

}
