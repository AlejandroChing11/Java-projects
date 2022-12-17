public class SwitchSentence {
    public static void main(String[] args) {
        String colorModeSelected = "Blue dark";
        switch (colorModeSelected) {
            case "light":
                System.out.println("Selected Light mode");
                break;
            case "Dark":
                System.out.println("Selected Dark mode");
                break;
            case "Ambar":
                System.out.println("Selected Ambar mode");
                break;
            case "Blue dark":
                System.out.println("Selected blue dark mode");
                break;
            default:
                System.out.println("Select one valid mode");
        }
    }
}
