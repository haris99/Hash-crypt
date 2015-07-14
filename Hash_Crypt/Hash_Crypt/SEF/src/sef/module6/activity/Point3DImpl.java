package sef.module6.activity;

/**
 * @author John Doe
 * 
 *         This class represents a point in 3D space. The coordinates are
 *         represented by a set of values x, y an z that represents the
 *         coordinates along each plane
 */
public class Point3DImpl extends Point2DImpl implements Point3D {

	private double z;

	/**
	 * Creates a Point3D object with the default coordinate of 0,0,0
	 *
	 */
	public Point3DImpl() {
		super();
		//this.x = 0;
		//this.y = 0;
		this.z = 0;
	}

	/**
	 * Creates a Point3D object at the specified coordinates
	 * 
	 * @param x
	 *            coordinate along the x axis
	 * @param y
	 *            coordinate along the y axis
	 * @param z
	 *            coordinate along the z axis
	 */
	public Point3DImpl(double x, double y, double z) {
		//this.x = x;
		//this.y = y;
		super(x,y);
		this.z = z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#setZ(double)
	 */
	public final void setZ(double z) {
		this.z=z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getZ() {
		return z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#move(double, double, double)
	 */
	public void move(double x2, double y2, double z2) {
		//this.x=x2;
		//this.y=y2;
		super.move(x2,y2);
		this.z=z2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#translate(double, double, double)
	 */
	public void translate(double x2, double y2, double z2) {
		super.translate(x2, y2);
		//x=x+x2;
		//y=y+y2;
		z=z+z2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#equals(double, double, double)
	 */
	public boolean equals(double x2, double y2, double z2) {
		if (x2==x && y2==y && z2==z){
			return true;
		}
		return false;
	}

	/**
	 * Compares if the coordinates are equal to the coordinates specified by the
	 * parameter
	 * 
	 * @param p
	 *            the coordinates to compare
	 * 
	 * @return true if the parameter is an instance of Point3D and contain the
	 *         same coordinates, false otherwise
	 */
	public boolean equals(Object p) {
		if (p==null){
			return false;
		}
		if (p == this){
			return true;
		}
		if (p instanceof Point3D)
	    {
	        Point3D other = (Point3D)p;
	        if (other.equals(this.x, this.y,this.z)){
	        	return true;
	        }

	    }
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sef.module5.activity.Point3D#getDistance(sef.module5.activity.Point3D)
	 */
	public double getDistance(Point3D p) {
		double aSqr = (p.getX()-x)*(p.getX()-x);
		double bSqr = (p.getY()-y)*(p.getY()-y);
		double cSqr = (p.getZ()-z)*(p.getZ()-z);
		double distance = Math.sqrt(aSqr+bSqr+cSqr);
		return distance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getDistance(double, double, double)
	 */
	public double getDistance(double x2, double y2, double z2) {
		double aSqr = (x2-x)*(x2-x);
		double bSqr = (y2-y)*(y2-y);
		double cSqr = (z2-z)*(z2-z);
		double distance = Math.sqrt(aSqr+bSqr+cSqr);
		return distance;

	}

}
