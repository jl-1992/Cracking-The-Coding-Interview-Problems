import java.lang.Math;
import java.text.DecimalFormat;

public class Problem_16_3{
	DecimalFormat df = new DecimalFormat("#.00");


	static class Point{
		double x;
		double y;

		public Point(double x, double y){
			this.x=x;
			this.y=y;
		}
	}

	public Point intersection(Point a, Point b, Point c, Point d){		

		Point ans = new Point(-10000,-10000);

		double slope_ab = (b.y-a.y)/(b.x-a.x);
		double slope_cd = (d.y-c.y)/(d.x-c.x);

		double intercept_ab = findIntercept(slope_ab,a);
		double intercept_cd = findIntercept(slope_cd,c);

	 	double min_x = findMinX(a,b,c,d);
	 	double max_x = findMaxX(a,b,c,d);
	 	double min_y = findMinY(a,b,c,d);
	 	double max_y = findMaxY(a,b,c,d);

	 	double x=min_x;

	 	for(int i=0; i<=1000000 || x>=max_x;++i){
	 		if((double)Math.round(((slope_ab*x)+intercept_ab) * 1000d/ 1000d)==(double)Math.round(((slope_cd*x)+intercept_cd) * 1000d/ 1000d)){
	 			ans.x=x;
	 			if((slope_ab*ans.x)+intercept_ab>max_y || (slope_ab*ans.x)+intercept_ab<min_y)
	 				break;
	 			else{
	 				ans.y=((slope_ab*ans.x)+intercept_ab);
	 				return ans;
	 			}
	 		}
	 		x += .001;
	 	}
	 	//e.g. intersection point not found
	 	return ans;
	}

	public double findIntercept(double slope, Point p){
		return (p.y-(slope*p.x));
	}

	public double findMinX(Point a, Point b, Point c, Point d){
		double min = a.x;
		min=Math.min(min,b.x);
		min=Math.min(min,c.x);
		min=Math.min(min,d.x);

		return min;
	}

	public double findMaxX(Point a, Point b, Point c, Point d){
		double max = a.x;
		max=Math.max(max,b.x);
		max=Math.max(max,c.x);
		max=Math.max(max,d.x);

		return max;
	}

	public double findMinY(Point a, Point b, Point c, Point d){
		double min = a.y;
		min=Math.min(min,b.y);
		min=Math.min(min,c.y);
		min=Math.min(min,d.y);

		return min;
	}

	public double findMaxY(Point a, Point b, Point c, Point d){
		double max = a.y;
		max=Math.max(max,b.y);
		max=Math.max(max,c.y);
		max=Math.max(max,d.y);

		return max;
	}
	
	public static void main(String[] args){
		Problem_16_3 p = new Problem_16_3();

		Point a = new Point(0.0,3.0);
		Point b = new Point(5.0,-2.0);
		Point c = new Point(0.0,0.0);
		Point d = new Point(3.0,2.0);

		Point z = p.intersection(a,b,c,d);

		System.out.println("["+z.x+", "+z.y+"]");
	}
}