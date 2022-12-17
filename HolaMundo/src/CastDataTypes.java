public class CastDataTypes {
    public static void main(String[] args) {

        //En un año ubicar 30 perritos.
        //cuantos ubique al mes.
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthly = (int) monthlyDogs;
        System.out.println(estimatedMonthly);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);
    }
}
