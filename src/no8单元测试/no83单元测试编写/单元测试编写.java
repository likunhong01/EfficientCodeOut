package no8单元测试.no83单元测试编写;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("售票器类型测试")
public class 单元测试编写 {
//    private TicketSeller ticketSeller;

    // 定义在整个测试类完成后执行的操作
    // 通常包括全局和外部资源的创建和初始化
    @BeforeAll
    public static void init() {
        // ...
    }

    // 定义在整个测试类完成后执行的操作
    // 通常包括全局和外部资源的释放和销毁
    @AfterAll
    public static void cleanup() {
        // ...
    }

    // 定义在每个测试用例开始前执行的操作
    // 通常包括基础数据和运行环境的准备
    @BeforeEach
    public void create() {
//        this.ticketSeller = new TicketSeller();
        // ...
    }

    // 定义在每个测试用例结束后的操作
    // 通常包括运行环境的清理
    @AfterEach
    public void destroy(){
        // ...
    }

    // 测试用例
    @Test
    @DisplayName("售票后余票应该减少")
    public void test() {
        // 执行测试的代码
    }

    // Disabled注释将禁用测试用例
    // 该测试用例会出现在最终的报告中，但不会执行
    @Disabled
    @Test
    @DisplayName("111")
    public void test2() {
        // 测试代码
    }
}
