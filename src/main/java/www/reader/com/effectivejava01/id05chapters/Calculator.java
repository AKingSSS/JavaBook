package www.reader.com.effectivejava01.id05chapters;

/**
 * @ClassName Calculator
 * @Description 泛型接口
 * @Author yangkang
 * @Date 2019/10/9 16:36
 * @Version 1.0
 **/
public interface Calculator<T> {
    public T and(T a, T b);
}
