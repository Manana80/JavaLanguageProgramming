package Day51_Map;

public class TestEnum {
    public static void main(String[] args) {
       // String browser = "Wooden Spoon";
        Browser browser = Browser.SAFARI;


       // Browser browser1 = Browser. WOODENSPOOn; // anything other than the constants we provided in Enum will give us compile error

        switch (browser){
            case FIREFOX:
                System.out.println("FireFox is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;
            case SAFARI:
                System.out.println("Safari is selected");
                break;
            default:
                System.out.println("Chrome is selected");
        }



    }
}
