package week3.day1.Interface;

public class MyTv {
    public static void main(String[] args) {
        SamsungTV samsungTV = new SamsungTV();
        samsungTV.pictureQuality();
        samsungTV.sound();
        samsungTV.starTv();
        samsungTV.tVOn();

        AndroidTvDesign androidTvDesign = new SamsungTV();
        androidTvDesign.sound();
        androidTvDesign.tVOn();
        androidTvDesign.starTv();


    }
}
