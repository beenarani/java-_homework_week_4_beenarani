package homework.abstractexample23;
//4. Create the fourth class name TestAbstraction1 and inside create the
//main method as below

class TestAbstraction1 {
    public static void main(String args[]){
        Shape s=new Circle1();//In a real scenario, object is provided through
        //  method, e.g., getShape() method
        s.draw();
    }
}

