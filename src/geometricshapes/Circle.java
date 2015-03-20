package geometricshapes;
/**
 * BB= Bounding Box
 * @author lralberetti
 *
 */
public class Circle {
	private double xC;
	private double yC;
	private double r;
	
	/**
	 * inizializza il tutto, la lunghezza del raggio deve essere positivo
	 * @param xC
	 * @param yC
	 * @param r
	 */
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		if(r<=0){
			throw new IllegalArgumentException("INSERISCI UN VALORE POSITIVO");
		}
		else
			this.r = r;
	}
	/**
	 * 
	 * @param c
	 * @return true se la BB del oggetto cerchio che richiama il metodo contiene la BB dell'altro oggetto cerchio passato come paramentro
	 */
	public boolean contains(Circle c){
		boolean result=false;
		if(this.getXMin()<=c.getXMin() && this.getYMin()<=c.getYMin() && this.getXMax()>=c.getXMax() && this.getYMax()>=c.getYMax())
			result=true;
		return result;
    }
	/**
	 * 
	 * @return la X minima della BB
	 */
	public double getXMin(){
		return this.xC-this.r;
	}
	/**
	 * 
	 * @return la Y minima della BB
	 */
	public double getYMin(){
		return this.yC-this.r;
	}
	/**
	 * 
	 * @return la X massima della BB
	 */
	public double getXMax(){
		return this.xC+r;
	}
	/**
	 * 
	 * @return la Y massima della BB
	 */
	public double getYMax(){
		return this.yC+this.r;
	}
	/**
	 * 
	 * @return la coordinata X del centro
	 */
	public double getXC() {
		return xC;
	}
	/**
	 * 
	 * @param xC l'ascissa del centro
	 */
	public void setXC(double xC) {
		this.xC = xC;
	}
	/**
	 * 
	 * @return la coordinata Y del centro
	 */
	public double getYC() {
		return yC;
	}
	/**
	 * 
	 * @param yC coordinata del centro
	 */
	public void setYC(double yC) {
		this.yC = yC;
	}
	/**
	 * 
	 * @return la lunghezza del raggio
	 */
	public double getR() {
		return r;
	}
	/**
	 * 
	 * @param r lunghezza del raggio
	 * r deve essere maggiore di 0
	 */
	public void setR(double r) {
		if(r<=0)
			throw new IllegalArgumentException("IL RAGGIO DEVE ESSERE UN VALORE MAGGIORE DI 0");
		else
			this.r = r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
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
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}

}
