public class IncrementDecrement {
    public static void main(String[] args) {
        //Postfijo este primero accede al dato y realiza la operación, en cambio prefijo obtiene el dato incrementado.
        int lives = 5;
        lives = lives - 1;
        //prefijo
        System.out.println(lives); //4
        --lives; //Decremento
        System.out.println(lives); //3
        ++lives; //Incremento
        System.out.println(lives); //4

        int gift = 100 + ++lives; //Prefijo
        System.out.println(gift);
        System.out.println(lives);
    }
}