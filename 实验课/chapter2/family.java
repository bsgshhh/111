package chapter2;

public class family {
    tv homeTv;
    public void buytv(tv t) {
        homeTv = t;
    }
    void removeTv(int m) {
        homeTv.setChannel(m);
    }
    public void watchtv() {
        homeTv.show();
    }
    
}
