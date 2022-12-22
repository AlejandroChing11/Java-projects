public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[5];
        String days[] = new String[7];

        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2]; //Recommendable to a Data Base

        names[0] = "Alejandro";
        names[1] = "Mei Li";
        names[2] = "Sandra";
        names[3] = "Marlon";
        names[4] = "Jenzey";
                            //5
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        /*System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);*/

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Argentina";
        cities[1][1] = "Buenos Aires";
        cities[2][0] = "Mexico";
        cities[2][1] = "Ciudad de mexico";
        cities[3][0] = "Venezuela";
        cities[3][1] = "Caracas";


        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) { //cities[i].length quiere decir los espacios que tiene o ocupa la fila o renglon.
                System.out.println(cities[i][j]);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/








    }
}
