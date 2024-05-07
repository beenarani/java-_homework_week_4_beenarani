package homework.encapsulation26;

    public class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            // setting values of the variables
            obj.setName("Beena");
            obj.setAge(33);
            obj.setRollNo(33);
            // Displaying values of the variables
            System.out.println("Prime's name: " +
                    obj.getName());
            System.out.println("Prime's age: " +
                    obj.getAge());
            System.out.println("Prime's rollNo: " +
                    obj.getRollNo());

        }
    }

