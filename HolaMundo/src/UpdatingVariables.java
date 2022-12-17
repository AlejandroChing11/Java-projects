public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 2000;
        //Have recieved a bono
        salary = salary + 200;
        System.out.println(salary);
        //discount 50
        salary = salary - 50;
        System.out.println(salary);
        //2 extra hours and food
        salary = salary + (30*2) - 30;
        System.out.println(salary);

        //Updating strings
        String name = "Alejandro Ching";
        name = name + " Franco";
        System.out.println("Tu nombre es: " + name);


    }
}
