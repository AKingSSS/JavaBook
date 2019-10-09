package www.reader.com.effectivejava01.id05chapters;

/**
 * @ClassName CalculatorInteger
 * @Description 泛型接口
 * @Author yangkang
 * @Date 2019/10/9 16:36
 * @Version 1.0
 **/
public class CalculatorInteger implements Calculator<Integer> {
    @Override
    public Integer and(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculatorInteger ci = new CalculatorInteger();
        Integer val = ci.and(10, 20);
        System.out.println(val);
    }
}
