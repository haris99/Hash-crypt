package sef.module6.activity;

public class Point2DImpl implements Point2D {

	protected double x;
	protected double y;

	/**
	 * Creates a Point2D object at a default location (0,0)
	 */
	public Point2DImpl() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Create a Point2D object that represents a 2D coordinate specified by the
	 * constructor parameters
	 * 
	 * @param x
	 *            coordinate of the point along the x-axis
	 * @param y
	 *            coordinate of the point along the y-axis
	 */
	public Point2DImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#move(double, double)
	 */
	public final void move(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#setX(double)
	 */
	public void setX(double x) {
		this.x = x;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#setY(double)
	 */
	public void setY(double y) {
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getX()
	 */
	public double getX() {
		
		return x;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getY()
	 */
	public double getY() {

		return y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#translate(double, double)
	 */
	public final void translate(double dx, double dy) {
		this.x = this.x+dx;
		this.y = this.y+dy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object p) {
		if (p==null){
			return false;
		}
		if (p == this){
			return true;
		}
		if (p instanceof Point2D)
	    {
	        Point2D other = (Point2D)p;
	        if (other.equals(this.x, this.y)){
	        	return true;
	        }

	    }
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#equals(double, double)
	 */
	public boolean equals(double x2, double y2) {
		if (x2==x && y2==y){
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sef.module5.activity.Point2D#getDistance(sef.module5.activity.Point2D)
	 */
	public final double getDistance(Point2D p) {
		double aSqr = (p.getX()-x)*(p.getX()-x);
		double bSqr = (p.getY()-y)*(p.getY()-y);
		double distance = Math.sqrt(aSqr+bSqr);
		return distance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point2D#getDistance(double, double)
	 */
	public final double getDistance(double x2, double y2) {
		double aSqr = (x-x2)*(x-x2);
		double bSqr = (y-y2)*(y-y2);
		double distance = Math.sqrt(aSqr+bSqr);
		return distance;
	}

}
