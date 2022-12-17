public class MathemathicsOperations {
    public static void main(String[] args) {
        double x = 5;
        double y = 4;
        //Returns una parte entera hacia arriba de un tipo de dato numerico, en este caso //3.0
        System.out.println(Math.ceil(x));

        //Returns una parte entera hacia abajo de un tipo de dato numerico, en este caso //2.0
        System.out.println(Math.floor(x));

        //Returns un numero elevado a otro numero (pow)
        System.out.println(Math.pow(x,y)); //8

        //Devuelve cual de los datos es mayor
        System.out.println(Math.max(x,y)); //3

        //Devolver la raiz cuadrada.
        System.out.println(Math.sqrt(y)); //2

        //Devolver el area de un circulo.
        System.out.println(Math.PI * Math.pow(y, 2)); //50

        //Devolver el area de una esfera.
        System.out.println(4 * (Math.PI) * Math.pow(x, 2)); //50

        //Volumen de una esfera
        System.out.println((4/3) * Math.PI * Math.pow(x, 3));

    }
}
