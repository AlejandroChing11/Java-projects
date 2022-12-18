public class Functions {
    public static void main(String[] args) {
        double y = 3;
        //Area del circulo
        //System.out.println(Math.PI * Math.pow(y, 2));
        double area = circleArea(y);
        System.out.println(area);

        double areaSphere = sphereArea(y);
        System.out.println(areaSphere);

        double volume = shpereVolume(y);
        System.out.println(volume);

        System.out.println("Pesos a dolares: " + converToDollar(10000000, "MXN"));

    }
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double shpereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r ,3);
    }

    public static double converToDollar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.051;
                break;
            case "COP":
                quantity = quantity * 0.00021;
                break;
            default:
                System.out.println("Ingrese una currency valida");
        }
        return quantity;
    }
}
