package no2面向对象.no24方法;

public class 可变参数 {
    public static void listUsers(Object... args) {
        System.out.println(args.length);
    }

    public static void main(String[] args) {
        listUsers(1, 2, 3); // 3
        listUsers(new int[]{1, 2, 3});  // 1
        listUsers(3, new String[]{"1", "2"});   // 2
        listUsers(new Integer[]{1, 2, 3});  // 3
        listUsers(3, new Integer[]{1, 2, 3});   // 2
        // 使用Object作为可变参数时过于灵活，类型转换场景不好预判
        // 所以算的是对象个数。
    }
}
