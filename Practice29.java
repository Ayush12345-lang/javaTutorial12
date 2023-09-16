package sharma;
abstract class Shape709
{
	static final  double Pi = 3.1456;
	
	abstract  double   RectangleArea(double l, double w );
	abstract double  SquareArea(double s);
	abstract double CircleArea(double r);
}

class Area476 extends Shape709{
	
	
  @Override
	double RectangleArea(double l, double w)
	{
		
		return l*w;
		}
	
  @Override
	double SquareArea(double s)
	{
		return s*s;
	}
  @Override
	 double CircleArea(double r)
	{
	         return  Shape709.Pi *r*r;
	}
	
}

public class Practice29 {
	
	public static void main(String[] args) {
		
		Area476 a = new Area476();
		System.out.println("Area Of Rectangle is: " + a.RectangleArea(4.0, 7.6));
        System.out.println("Area Of Square is: " + 		a.SquareArea(4.90));
        System.out.println("Area Of Circle is: " + 		a.CircleArea(65.2));
		
		
	}

}
