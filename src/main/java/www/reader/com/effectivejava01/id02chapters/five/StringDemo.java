package www.reader.com.effectivejava01.id02chapters.five;

/**
 * @ClassName StringDemo
 * @Description 避免创建不必要的对象
 * @Author yangkang
 * @Date 2019/9/27 17:21
 * @Version 1.0
 **/
public class StringDemo {

    /**
     * 错误示范
     * @return
     */
    public static long test1() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            String s = new String("bikini");
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    /**
     * 正确示范
     * @return
     */
    public static long test2() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            String s = "bikini";
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());

    }
}
