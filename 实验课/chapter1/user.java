public class user {
    public static void main(String[] args) {
        Vehicle car1, car2;
        car1 = new Vehicle();
        car2 = new Vehicle();
        car1.setpower(128);
        car2.setpower(76);
        System.out.println("car1的功率是" + car1.getpower());
        System.out.println("car2的功率是" + car2.getpower());
        //car1调用speedup方法将自己速度增加80
        car1.speedup(80);
        //car2调用speedup方法将自己速度增加80
        car2.speedup(80);
        System.out.println("car1的速度是" + car1.getspeed());
        System.out.println("car2的速度是" + car2.getspeed());
        car1.speeddown(10);
        car2.speeddown(20);
        System.out.println("car1的速度是" + car1.getspeed());
        System.out.println("car2的速度是" + car2.getspeed());
    }
}