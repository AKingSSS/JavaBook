package www.reader.com.effectivejava01.id03chapters.nine;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yangkang
 * @Date 2019/10/9 14:45
 * @Version 1.0
 **/
public class Student {
    private String name;
    private Integer age;
    private Integer sex;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public static void main(String[] args) {
        Student s1 = new Student("张涵予");
        Student s2 = new Student("张涵予");
        System.out.println(s1.equals(s2));
        System.out.println("s1.hashcode() = " + s1.hashCode());
        System.out.println("s2.hashcode() = " + s2.hashCode());
    }

}
