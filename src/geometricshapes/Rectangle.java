package geometricshapes;

public class Rectangle extends GeometricShape{
	protected double xV;
	protected double yV;
	protected double xSideLength;
	protected double ySideLength;
	/**
	 * inizializza il tutto, la lunghezza del raggio deve essere positivo
	 * @param xV
	 * @param yV
	 * @param xSideLength
	 * @param ySideLength
	 */
	public Rectangle(double xV, double yV, double xSideLength,
			double ySideLength) {
		this.xV = xV;
		this.yV = yV;
		if(xSideLength<=0){
			throw new IllegalArgumentException ("INSERISCI UN VALORE POSITIVO");
		}
		else{
			this.xSideLength=xSideLength;
		}

		if(ySideLength<=0){
			throw new IllegalArgumentException ("INSERISCI UN VALORE POSITIVO");
		}
		else{
			this.ySideLength= ySideLength;
		}
	}
	/**
	 * @return la coordinata di XMax della BB
	 */
	@Override
	double getXMax() {
		return this.xV+this.xSideLength;
	}
	/**
	 * @return la coordinata di YMax della BB
	 */
	@Override
	double getYMax() {

		return this.yV+this.ySideLength;
	}
	/**
	 * @return la coordinata di XMin della BB
	 */
	@Override
	double getXMin() {
		return this.xV;
	}
	/**
	 * @return la coordinata di YMin della BB
	 */
	@Override
	double getYMin() {
		return this.yV;
	}
	/**
	 * 
	 * @return la coordinata del vertice
	 */
	public double getXV() {
		return xV;
	}
	/**
	 * 
	 * @param xV viene settato come ascissa del vertice
	 */
	public void setXV(double xV) {
		this.xV = xV;
	}
	/**
	 * 
	 * @return  ordinata del vertice
	 */
	public double getYV() {
		return yV;
	}
	/**
	 * 
	 * @param yV viene settata come ordinata del vertice 
	 */
	public void setYV(double yV) {
		this.yV = yV;
	}
	/**
	 * 
	 * @return la lunghezza del lato 
	 */
	public double getXSideLength() {
		return xSideLength;
	}
	/**
	 * 
	 * @param xSideLength viene setteta la lughezza del lato dal vertice
	 */
	public void setXSideLength(double xSideLength) {
		if(xSideLength<=0)
			throw new IllegalArgumentException("IL VALORE DEL LATO DEVE ESSERE MAGGIORE DI 0");
		else
			this.xSideLength = xSideLength;
	}
	/**
	 * 
	 * @return la lunghezza del lato in altezza 
	 */
	public double getYSideLength() {
		return ySideLength;
	}
	/**
	 * 
	 * @param ySideLength viene settata la lunghezze del lato in altezza del vertice
	 */
	public void setYSideLength(double ySideLength) {
		if(ySideLength<=0)
			throw new IllegalArgumentException("IL VALORE DEL LATO DEVE ESSERE MAGGIORE DI 0");
		else
			this.ySideLength = ySideLength;
	}
	@Override
	public String toString() {
		return "Rectangle [xV=" + xV + ", yV=" + yV + ", xSideLength="
				+ xSideLength + ", ySideLength=" + ySideLength + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xSideLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ySideLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(xSideLength) != Double
				.doubleToLongBits(other.xSideLength))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(ySideLength) != Double
				.doubleToLongBits(other.ySideLength))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}


}
