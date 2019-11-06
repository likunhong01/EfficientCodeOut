package no2面向对象.no23类;

public class no3内部类 {
    // 成员内部类
    private class InstanceInnerClass{}

    // 静态内部类
    static class StaticInnerClass{}

    public static void main(String[] args) {
        // 匿名内部类
        (new Thread() {}).start();

        // 局部内部类
        class  MethodClass1{}
    }
}
