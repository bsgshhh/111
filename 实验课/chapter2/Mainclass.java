package chapter2;

public class Mainclass {
    public static void main(String[] args) {
        tv haiertv = new tv();
        //haiertv调用setChannel(int m)方法，并向参数m传递5
        haiertv.setChannel(5);
        System.out.println("海尔电视的频道是" + haiertv.getChannel());
        family czwFamily = new family();
        //czwFamily调用void buytv(tv t)方法，将haiertv作为参数传递给setTv方法
        czwFamily.buytv(haiertv);
        System.out.println("czwFamily开始看电视");
        czwFamily.watchtv();
        int m = 2;
        System.out.println("czwFamily将电视调到了"+haiertv.getChannel()+"频道");
        czwFamily.removeTv(m);
        System.out.println("haiertv的频道是" + haiertv.getChannel());
        System.out.println("czwFamily再看电视");
        czwFamily.watchtv();


    }
    
}
