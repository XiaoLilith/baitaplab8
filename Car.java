public  interface Car {
    void accelerarate();
    void getColor();
    void getspeed();
}
class BMW implements Car {
    @Override
    public void accelerarate() {
        System.out.println("BMW:acclerate");
    }

    @Override
    public void getColor() {
        System.out.println("mau gi?");
    }

    @Override
    public void getspeed() {
        System.out.println("120km/h");
    }
}
class Civic implements  Car{
    @Override
    public void accelerarate() {
        System.out.print("accelrate");
    }
    public void getspeed() {
        System.out.println("150km/h");

    }

    @Override
    public void getColor() {
        System.out.println("mau vang");
    }
}
