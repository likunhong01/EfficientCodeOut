package no5异常;

public class no01throw和throws {
    public Long generateOrderId(Long userId) throws Exception {
        try {
            return new Long(1);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
