package oop2;

class SpaceshipCalc {
    public final int calculateAirBalloons(int passengerCount){
        return passengerCount * 10;
    }

   public int calculateBookCount(int passengerCount){
       return passengerCount * 2;
   }
    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35));
        System.out.println(calc.calculateBookCount(50));
    }
}
