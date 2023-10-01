package oop2;

public class SpaceShip {
    private String name;
    private String serialNumber;
    String SN = "SN";

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.isBlank() || serialNumber.length() > 8) {
            return;

        }

        this.serialNumber = serialNumber;
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }
}
