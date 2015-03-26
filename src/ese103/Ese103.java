package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) throws Exception {
		GeometricShape ShapeArray[]=new GeometricShape[5];	
		
		ShapeArray[0]=new Circle(2,3,3);
		ShapeArray[1]=new Circle(2,5,1);
		ShapeArray[2]=new Triangle(2,3,4);
		ShapeArray[3]=new Rectangle(1,2,3,4);
		ShapeArray[4]=new Square(1,2,5);
		
		GeometricShape a,b;
		for(int i=0;i<ShapeArray.length;i++){
			a=ShapeArray[i];
			for(int j=0;j<ShapeArray.length;j++){
				b=ShapeArray[j];
					if(a.contains(b))
						System.out.println(a+"Contiene"+b);
						else
							System.out.println(a+"NON contiene"+b);
				
			}
		}
		
	}
}