package no2面向对象.no24方法;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class 覆写 {
}

class Father {
    public void method() {
        System.out.println("Eather's method");
    }
}

class Son1 extends Father {
    // 编译报错，不允许修改为访问权限更严格的修饰符
//    @Override
//    private void method() {
//        System.out.println("Son's method");
//    }
}

// -------正确的例子：----------
class Father2{
    protected Number doSomething( int a , Integer b , Object c) throws
            SQLException {
        System.out.println("父类方法执行");
        return new Integer(7);
    }
}
class Son2 extends Father {
    public Integer doSomething(int a , Integer b, Object c) throws
            SQLClientInfoException {
        if (a == 0) {
            throw new SQLClientInfoException();
        }
        return new Integer(17);
    }
}