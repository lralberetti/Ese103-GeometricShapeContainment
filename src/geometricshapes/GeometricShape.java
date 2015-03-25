package geometricshapes;

public abstract class GeometricShape {
	/**
	 * 
	 * @return il vertice XMax della BB
	 */
	abstract double getXMax();
	/**
	 * 
	 * @return il vertice YMax della BB
	 */
	abstract double getYMax();
	/**
	 * 
	 * @return il vertice XMin della BB
	 */
	abstract double getXMin();
	/**
	 * 
	 * @return il vertice YMin della BB
	 */
	abstract double getYMin();
	
	/**
	 * 
	 * @param s
	 * @return true se la BB del oggetto che richiama il metodo contiene la BB dell'altro oggetto passato come paramentro
	 */
	public boolean contains(GeometricShape s){
		boolean result=false;
		if(this.getXMin()<=s.getXMin()&&this.getYMin()<=s.getYMin()&&this.getXMax()>=s.getXMax()&&this.getYMax()>=s.getYMax())
		 result=true;
		return result;
	}
}
