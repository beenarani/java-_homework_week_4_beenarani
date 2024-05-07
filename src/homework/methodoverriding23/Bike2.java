package homework.methodoverriding23;

class Bike2 extends Vehicle {
    public void run(){
        System.out.println("Bike is running safely");

    }
    public static void main(String args[]){
            Bike2 obj = new Bike2(); // Creating object
        obj.run();//calling method

    }
}
