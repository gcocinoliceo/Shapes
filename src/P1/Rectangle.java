package P1;

public class Rectangle {
	private static double base;
    private static double height;
    
    public void setBase(double inputBase){
        base = inputBase;
    }
    public void setHeight(double inputHeight){
        height = inputHeight; 
    }
    
    public double getArea(){
        return base * height;
    }
    public double getPerimeter(){
        return (base*2)+(height*2);
    }
}
