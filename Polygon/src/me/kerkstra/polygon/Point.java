package me.kerkstra.polygon;

/**
 * Point on 2D landscape
 * 
 * @author Roman Kushnarenko (sromku@gmail.com)</br>
 * Modified by: John Kerkstra (john@kerkstra.me) </br>
 * 
 * The 'Point-in-Polygon' algorithm has been modified to use doubles. 
 * This will allow for non-integer units, such as coordinates, to be used more easily with the same accuracy.
 * 
 */
public class Point
{
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double x;
	public double y;

	@Override
	public String toString()
	{
		return String.format("(%.2f,%.2f)", x, y);
	}
}