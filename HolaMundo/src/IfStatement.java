public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSend = 3;
        if (isBluetoothEnable == true) {
            //Instructions, (send file)
            fileSend++;
            System.out.println("File sent");
        } else {
            System.out.println("Bluethoot disable");
        }
    }
}
