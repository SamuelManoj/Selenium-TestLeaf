package week3.day1.abstraction;

public class Automation extends MultipleLanguage implements Language, TestTool{

    @Override
    public void Java() {
        System.out.println("Java method implemented");
    }

    @Override
    public void Selenium() {
        System.out.println("Selenium method implemented");
    }

    @Override
    public void python() {
        System.out.println("Python method implemented");
    }

    @Override
    public void ruby() {
        System.out.println("Ruby method implemented");
    }

}
