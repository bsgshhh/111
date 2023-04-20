public class Vehicle {
    private int power;
    private double speed;
    public void setpower(int p) {
        power = p;
    }
    public int getpower() {
        return power;
    }
    public void speedup(int s) {
        speed = speed + s;
    }
    public void speeddown(int d) {
        speed = speed - d;
    }
    public double getspeed() {
        return speed;
    }
    
}
