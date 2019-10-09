package www.reader.com.effectivejava01.id05chapters;

/**
 * @ClassName Student
 * @Description 泛型类
 * @Author yangkang
 * @Date 2019/10/9 16:19
 * @Version 1.0
 **/
public class Student<T> {
    private T javase;

    public Student() {

    }

    public Student(T javase) {
        this.javase = javase;
    }

    public T getJavase() {
        return javase;
    }

    public void setJavase(T javase) {
        this.javase = javase;
    }

    public static void main(String[] args) {
/*        Student student = new Student();
        student.setJavase("aking");
        System.out.println(student.getJavase());*/

        Student<String> s = new Student<>("aking");
        System.out.println(s.getJavase());


    }
}
