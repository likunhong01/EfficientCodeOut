package no1计算机基础.no12浮点数;

import java.math.BigDecimal;

public class TestFloat {

    public static void main(String[] args) {
        equal_float();


    }

    // 浮点数的正确比较法2种
    public static void equal_float(){
        float g = 1.0f - 0.9f;
        float h = 0.9f - 0.8f;

        double diff = 1e-6;
        if (Math.abs(g - h) < diff) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);
        System.out.println(x.equals(y));

        // x和y不是一个对象
        System.out.println(x == y);
    }

    public static void use_float_double(){
        // 比较浮点数比较有意外
        float ff = 0.9f;
        double dd = 0.9d;

        System.out.println(ff/1.0);
        // 0.8999999761581421

        System.out.println(dd/1.0);
        // 0.9
    }
}
