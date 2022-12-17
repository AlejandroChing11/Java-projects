public class DataTypes {
    public static void main(String[] args) {
        //Data Types
        //interger
        int n = 10; //it has a limit of 10 digits
        //Long -- Always adding an "L" at the final of the variable.
        long s = 1020202020213123343L;
        //Double 8 bytes BIG
        double d = 123.567889; //more precision
        //Float 4 bytes it's like interger but with floats Always adding an "F" at the final of the variable.
        float dF = 123.456F;
        //Char is unicode, it can only accept a unic value 2 bytes.
        char name = 'a';
        //Boolean true or false 2 bytes.
        boolean isItTrue = true;
        //how to use var.
        var salary = 3000; //int
        var pension = salary * 0.03; //Double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Alejandro";
        System.out.println("employee name: " + employeeName + " salary: " + salary);

    }
}
