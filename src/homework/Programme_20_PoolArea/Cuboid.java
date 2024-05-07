package homework.Programme_20_PoolArea;

public class Cuboid extends Rectangle {
    double height; //Instance variable

    // Constructor  with parameters
    public Cuboid(double width, double length ,double height) {

        super(width, length); //call parent class with super keyword
        this.height=height;

        if(height<0){

            height=0;

        }
    }

    //Instance method with return type
    public double getHeight(){

        return height;

    }

    //Instance method with return type
    public double getVolume(){

        return getArea()*height; //call parent class method

    }

}

