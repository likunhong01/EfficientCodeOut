package no8单元测试.no83单元测试编写;
import org.junit.jupiter.api.*;

@DisplayName("交易服务测试")
public class Nested注解 {

    @Nested
    @DisplayName("用户交易测试")
    class UserTransactionTest {

        @Nested
        @DisplayName("正向测试用例")
        class PositiveCase {
            @Test
            @DisplayName("交易检查应通过")
            public void shouldPassCheckWhenParameterValid() {
                // ...
            }
        }
        @Nested
        @DisplayName("负向测试用例")
        class NegativeCase {
            // ...
        }
    }
    @Nested
    @DisplayName("商家交易测试")
    class CompanyTransactionTest {

    }
}
