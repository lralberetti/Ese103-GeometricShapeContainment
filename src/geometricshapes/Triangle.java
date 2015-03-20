package geometricshapes;
/**
 * BB= Bounding Box
 * @author lralberetti
 *
 */

public class Triangle {
	private double xV;
	private double yV;
	private double l;

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
	 * @param c
	 * @return true se la BB del oggetto triangolo che richiama il metodo contiene la BB dell'altro oggetto cerchio passato come paramentro

	 */
	public boolean contains(Circle c){
		boolean result=false;
		if(this.getXMin()<= c.getXMin() && this.getYMin() <= c.getYMin() && this.getYMax() >= c.getXMax() && this.getYMax() >= c.getYMax())
			result=true;
		return result;
	}
	/**
	 * 
	 * @param t
	 * @return true se la BB del oggetto triangolo che richiama il metodo contiene la BB dell'altro oggetto triangolo passato come paramentro

	 */
	public boolean contains(Triangle t){
		boolean result=false;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin() && this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax())
			result =true;
			return result;
	}
	/**
	 * 
	 * @return la coordinata YMin della BB
	 */
	public double getYMin(){
		return this.yV;
	}
	/**
	 * 
	 * @return la coordinata XMin della BB
	 */
	public double getXMin(){
		return this.xV;
	}
	/**
	 * 
	 * @return la coordinata XMax della BB
	 */
	public double getXMax(){
		return this.xV+this.l;
	}
	/**
	 * 
	 * @return la coordinata YMax della BB
	 */
	public double getYMax(){
		return this.yV+(Math.sqrt((3)/2))*this.l;
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
