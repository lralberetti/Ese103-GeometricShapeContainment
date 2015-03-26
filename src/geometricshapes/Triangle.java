package geometricshapes;
/**
 * BB= Bounding Box
 * @author lralberetti
 *
 */






public class Triangle extends GeometricShape{
	private double xV;
	private double yV;
	private double l;
	/**
	 * inizializza il tutto, la lunghezza del lato deve essere positivo
	 * @param xV
	 * @param yV
	 * @param l
	 */
	public Triangle(double xV, double yV, double l) {
		this.xV = xV;
		this.yV = yV;
		if(l<=0){
			throw new IllegalArgumentException ("INSERISCI UN VALORE POSITIVO");
		}
		else{
			this.l=l;
		}
	}

	/**
	 * 
	 * @return la coordinata YMin della BB
	 */
	@Override
	public double getYMin(){
		return this.yV;
	}
	/**
	 * 
	 * @return la coordinata XMin della BB
	 */
	@Override
	public double getXMin(){
		return this.xV;
	}
	/**
	 * 
	 * @return la coordinata XMax della BB
	 */
	@Override
	public double getXMax(){
		return this.xV+this.l;
	}
	/**
	 * 
	 * @return la coordinata YMax della BB
	 */
	@Override
	public double getYMax(){
		return this.yV + this.l * Math.sqrt(3) / 2;	
	}
	/**
	 * 
	 * @return resituisce la coordinata X del vertice
	 */
	public double getXV() {
		return xV;
	}
	/**
	 * Setta xv come coordinata X del vertice
	 * @param xV
	 */
	public void setXV(double xV) {
		this.xV = xV;
	}
	/**
	 * 
	 * @return restituisce yv come coordinata Y del vertice
	 */
	public double getYV() {
		return yV;
	}
	/**
	 * 
	 * @param Setta yv come coordinata Y del vertice
	 */
	public void setYV(double yV) {
		this.yV = yV;
	}
	/**
	 *  
	 * @return il valore della lunghezza del lato del triangolo equilatero
	 */
	public double getL() {
		return l;
	}
	/**
	 * Setta l come valore del lato del triangolo equilatero, deve essere positivo
	 * @param l
	 */
	public void setL(double l) {
		if(l<=0)
			throw new IllegalArgumentException("IL LATO DEVE ESSERE UN VALORE MAGGIORE DI 0");
		else
			this.l = l;
	}

	@Override
	public String toString() {
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}

}
