public class SmartPhone {
    String networkType;
    String displayType;
    int cameraMegaPixels;

    public SmartPhone(){
        networkType = "3g";
        displayType = "LCD";
        cameraMegaPixels = 16;
        System.out.println("Network Type: "+networkType);
        System.out.println("Display Type: "+displayType);
        System.out.println("Camera MegaPixels: "+cameraMegaPixels);
    }

    public SmartPhone(String networkType, String  displayType, int cameraMegaPixels){

        this.networkType = networkType;
        this.displayType = displayType;
        this.cameraMegaPixels = cameraMegaPixels;

        System.out.println("Network Type: "+networkType);
        System.out.println("Display Type: "+displayType);
        System.out.println("Camera MegaPixels: "+cameraMegaPixels);
    }

}
