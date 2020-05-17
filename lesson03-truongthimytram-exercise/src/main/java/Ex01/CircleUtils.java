package Ex01;

public class CircleUtils {
  
	private CircleUtils() {
		
	}
	public static void checkCirclePosition(Point point, Circle circle) {
		if (circle.getRadius() == 0) return;
		int dx = point.getX() - circle.getCenter().getX();
		int dy = point.getY() - circle.getCenter().getY();	
		double d = Math.sqrt(dx*dx + dy*dy);
		if(d < circle.getRadius()) System.out.println("Điểm nằm trong đường tròn");
		if(d > circle.getRadius()) System.out.println("Điểm nằm ngoài đường tròn");
		if(d == circle.getRadius()) System.out.println("Điểm nằm trên đường tròn");		
	}

}
