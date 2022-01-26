package P1;
import java.io.*;

public class Exercise {
    public static double doubleScan() {
        double doutput = 0;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        try {
            doutput = Integer.valueOf(kb.readLine()).doubleValue();
        } catch (Exception e) {
            System.out.println("Data error.");
        }

        return doutput;
    }

	public static void main(String[] args) {
		Circle cerchio = new Circle();
		Rectangle rettangolo = new Rectangle();
		
		System.out.println("Circle's radius length: ");
		cerchio.setRadius(doubleScan());	
		
		System.out.println("Cirlce's area: "+cerchio.getArea());
		System.out.println("Cirlce's circumference: "+cerchio.getCirc());
		
		// rettangolo
		System.out.println("Rectangles's base length: ");
		rettangolo.setBase(doubleScan());
		
		System.out.println("Rectangles's height length: ");
		rettangolo.setHeight(doubleScan());
		
		System.out.println("Cirlce's area: "+rettangolo.getArea());
		System.out.println("Cirlce's circumference: "+rettangolo.getPerimeter());
	}

}
