package d6_proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test1.png");
        Image image2 = new ProxyImage("test2.png");

        image1.displayImage();
        image2.displayImage();
    }
}
