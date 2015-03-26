package geometricshapes;

public class Square extends Rectangle{

	/**
	 * Il costruttore della classe derivata richiama il costruttore
	 * della classe padre, impostando opportunamente i valori.
	 */
	public Square (double xV,double yV,double l){
		super (xV,yV,l,l);
	}
	/**
	 * 
	 * @return  la lunghezza del lato 
	 */
	public double getL(){
		return this.xSideLength;

	}
	/**
	 * setto le due lunghezza uguali così da ottenere il quadrato
	 * @param l
	 */
	public void setL(double l){
		if(l<=0)
			throw new IllegalArgumentException("IL VALORE DEL LATO DEVE ESSERE MAGGIORE DI 0");
		else
			super.setXSideLength(l);
		super.setYSideLength(l);
	}
	/**
	 * E' necessario fare una ridefinizione per impostare le due lunghezze che nella classe padre sono diverse in quest'ultima 
	 * deve essere uguale, il valore del lato deve essere maggiore di 0
	 */
	@Override
	public void setXSideLength(double l){
		if(l<=0)
			throw new IllegalArgumentException("IL VALORE DEL LATO DEVE ESSERE MAGGIORE DI 0");
		else
			super.xSideLength=l;
		super.ySideLength=l;
	}
	/**
	 * E' necessario fare una ridefinizione per impostare le due lunghezze che nella classe padre sono diverse in quest'ultima 
	 * deve essere uguale, il valore del lato deve essere maggiore di 0
	 */
	@Override
	public void setYSideLength(double l){
		if(l<=0)
			throw new IllegalArgumentException("IL VALORE DEL LATO DEVE ESSERE MAGGIORE DI 0");
		else 
			super.ySideLength=l;
		super.xSideLength=l;
	}
	@Override
	public String toString() {
		return "Square [xV=" + xV + ", yV=" + yV + ", xSideLength="
				+ xSideLength + "]";
	}
}
