public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! This is program to get a checksum");
        if (!(args[0].equals("-i")) && !(args[0].equals("-md5")) && !(args[0].equals("-sha256"))){
            System.out.println("input error, try again");
        }
        else {
            switch (args[0]) {
                case "-i":
                    InteractiveMode MyResultIM = new InteractiveMode();
                    MyResultIM.Interactive(args);
                    break;

                default:
                    ManualMode MyResultMM = new ManualMode();
                    MyResultMM.GetHash(args);
                    break;
            }
        }
    }
}