package geometricshapes;

public class Square extends Rectangle{
	
	  /**
	  * Il costruttore della classe derivata richiama il costruttore
	  * della classe padre, impostando opportunamente i valori.
	  */
	  public Square (double xV,double yV,double l){
			  super (xV,yV,l,l);
	  }
	  public double getL(){
		  return this.xSideLength;
		  
	  }
	  public void setL(double l){
		  super.setXSideLength(l);
		  super.setYSideLength(l);
	  }
	  @Override
	  public void setXSideLength(double l){
		  if(l<=0)
			  throw new IllegalArgumentException("IL VALORE DEL LATO DEVE ESSERE MAGGIORE DI 0");
		  else
			  super.xSideLength=l;
		  	  super.ySideLength=l;
	  }
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
