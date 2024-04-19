public class PCData {
    String processor;
    String operationalSystem;
    String videoCard;
    int RAM;
    int ROM;
    double displaySize;
    int USBPort;
    int batteryCapacity;
    boolean hasWebCam;
    boolean hasFingerPrint;
    boolean hasSensorDisplay;
    boolean hasIncludedDigitalPen;
    boolean hasIncludedMouse;

    public PCData (String pr, String opSys, String graphic, int Ram, int Rom, double display, int USB, int battery, boolean webCam, boolean fingerPrint, boolean sensor, boolean pen, boolean mouse){
        this.processor = pr;
        this.operationalSystem = opSys;
        this.videoCard = graphic;
        this.RAM = Ram;
        this.ROM = Rom;
        this.displaySize = display;
        this.USBPort = USB;
        this.batteryCapacity = battery;
        this.hasWebCam = webCam;
        this.hasFingerPrint = fingerPrint;
        this.hasSensorDisplay = sensor;
        this.hasIncludedDigitalPen = pen;
        this.hasIncludedMouse = mouse;
    }
    public String toString(){

        return "\n    Processor: " + processor + "\n    Operational System: " + operationalSystem +  "\n    Graphic Card: " + videoCard + "\n    Memory RAM (in GB): " + RAM + "\n    Internal memory(in GB): " + ROM + "\n    Display Size (in inch): " + displaySize + "\n    Count of USB Port: " + USBPort + "\n    Battery Capacity (in mAh): " + batteryCapacity + "\n    WebCam: " + (hasWebCam ? "Yes" : "No") + "\n    Fingerprint: " + (hasFingerPrint ? "Yes" : "No") + "\n    Sensor Display: " + (hasSensorDisplay ? "Yes" : "No") + "\n    Digital Pen included: " + (hasIncludedDigitalPen ? "Yes" : "No") + "\n    Mouse included: " + (hasIncludedMouse ? "Yes" : "No");
    }

}