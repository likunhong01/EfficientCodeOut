package no5异常;

public class no02finally {

    public static final int fin() {
        int tmp = 1000;
        try {
            throw new Exception();
        } catch (Exception e){
            return ++tmp;
        } finally {
            tmp = 2000;
        }
    }
    public static void main(String[] args) {
        fin();  // 1001
    }
}

