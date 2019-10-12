package www.reader.com.effectivejava01.id05chapters.demo.dao;

import www.reader.com.effectivejava01.id05chapters.demo.dto.ChildDto;
import www.reader.com.effectivejava01.id05chapters.demo.dto.TeacherDto;

import java.util.List;

/**
 * @ClassName LearnDao
 * @Description 学习接口
 * @Author yangkang
 * @Date 2019/10/10 16:35
 * @Version 1.0
 **/
public interface LearnDao {
    public List<ChildDto> setChildParam();
    public List<TeacherDto> setTeacherParam();
}
