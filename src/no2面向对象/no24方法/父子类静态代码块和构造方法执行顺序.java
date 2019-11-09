package no2面向对象.no24方法;

public class 父子类静态代码块和构造方法执行顺序 {
    public static void main(String[] args) {
        new Son();
        new Son();
    }
}

class Son extends Parent {
    static { System.out.println("Son静态代码块 ");}

    Son() { System.out.println("son构造方法 "); }
}


class Parent {
    static { System.out.println("Parent 静态代码块 "); }

    public Parent() { System.out.println("Parent 构造方法"); }
}
