package www.reader.com.effectivejava01.id05chapters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName RightTest
 * @Description 泛型方法
 * @Author yangkang
 * @Date 2019/10/9 16:48
 * @Version 1.0
 **/
public class RightTest {
    /**
     * 声明一个泛型方法，该泛型方法中带一个T形参
     * @param from
     * @param to
     * @param <T>
     */
    static <T> Collection<T> test(Collection<? extends T> from , Collection<T> to)
    {
        for (T ele : from)
        {
            to.add(ele);
        }
        return to;
    }
    public static void main(String[] args)
    {
        List<String> as = new ArrayList<>();
        List<Object> ao = new ArrayList<>();
        as.add("java");
        as.add("python");
        // 下面代码完全正常,因为前一个集合的元素类型是后一个集合元素类型的子类型
        System.out.println(test(as , ao));
    }
}
