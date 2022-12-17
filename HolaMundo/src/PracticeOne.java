public class PracticeOne {
    public static void main(String[] args) {

        //Family presentation.
        String MY_NAME = "Alejandro";
        String DAD_NAME = "Marlon";
        String MOTHER_NAME = "Sandra";
        String SISTER_NAME = "Mei Li";
        String SISTER2_NAME = "Jenzey";
        int familyMembers = 5;
        System.out.println(MY_NAME);
        System.out.println(DAD_NAME);
        System.out.println(MOTHER_NAME);
        System.out.println(SISTER_NAME);
        System.out.println(SISTER2_NAME);

        //Practicing casting.
        char c = (int) 'z';
        int cI = c;
        System.out.println(cI); //Explicito.

        int i = 250;
        long iL = i;
        System.out.println(iL);
        short iS = (short) iL; //Explicit and forced casting.
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) 301.067; //Forced.
        System.out.println(dL);

        int x = 100;
        float xL = 100L;
        xL = xL + (float)5000.66;
        System.out.println(xL);

        int z = 737 * 100;
        byte zB = (byte) z;
        System.out.println(zB);

        double g = 298.638;
        double j = 25;
        double gJ = (long) g/j;
        System.out.println(gJ);




    }
}
