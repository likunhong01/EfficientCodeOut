package no8单元测试.no83单元测试编写;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

@DisplayName("售票其类型测试")
public class Tag标签用法 {
    @Test
    @Tag("fast")
    @DisplayName("售票后余票应该减少")
    public void shouldReduceInventoryWhenTicketSold0ut() {
//        Assertions.assertthat
    }

    @Test
    @Tag("slow")
    @DisplayName("tl4-20k4.")
    public void shouldSuccessWhenBuy20Tickets0nce () {

    }

    // 记得要在maven或者gradle中配置实现Tag的功能
}
