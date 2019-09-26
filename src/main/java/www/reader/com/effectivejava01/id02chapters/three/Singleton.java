package www.reader.com.effectivejava01.id02chapters.three;

/**
 * @ClassName Singleton
 * @Description 单例模式
 * @Author yangkang
 * @Date 2019/9/26 16:47
 * @Version 1.0
 **/
public class Singleton {
    /**
     * 私有化构造方法
     */
    private Singleton(){

    }
    private static Singleton singleton = new Singleton();

    /**
     * 提供公共静态方法访问
     * @return
     */
    public static Singleton getInstance(){
        return singleton;
    }

}
