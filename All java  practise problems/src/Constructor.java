//it is  also known as parameterized constructor
public class Constructor {
    int length;
    int width;
    Constructor(int x, int y ){   // constructor method
        length = x;
         width = y ;

    }
    int rectArea(){
        return  (length*width);
    }
}
class Rectangle{
    public static  void main (String args[]){
        // Constructor  rect = new Constructor();// it is default constructor it does not take any parameterzied value
        Constructor rect1 = new Constructor(10, 14);// calling constructor function
        int area1 = rect1.rectArea( );
        System.out.println("Area of Rectangle: " + area1);
    }
}