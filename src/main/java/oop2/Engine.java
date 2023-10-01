package oop2;

class Engine {
    public int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

class XFuelEngine extends Engine {
    protected String serialNumber;
    public String getFuelType() {
        return "XFuel";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class AdvancedXFuelEngine extends XFuelEngine {

    public void printInfo() {
            System.out.println("Serial number is " + serialNumber + ", power is " + power);

    }
}