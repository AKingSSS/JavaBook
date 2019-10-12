package www.reader.com.effectivejava01.id05chapters.demo.dao;

import www.reader.com.effectivejava01.id05chapters.demo.dto.ChildDto;
import www.reader.com.effectivejava01.id05chapters.demo.dto.TeacherDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LearnDaoImpl
 * @Description 学习接口实现类
 * @Author yangkang
 * @Date 2019/10/10 16:35
 * @Version 1.0
 **/
public class LearnDaoImpl implements LearnDao {
    @Override
    public List<ChildDto> setChildParam() {
        List<ChildDto> list = new ArrayList<>();
        // 模拟
        for (int i = 0; i < 10; i++) {
            ChildDto childDto = new ChildDto();
            childDto.setName(i + "");
            childDto.setAge(i);
            list.add(childDto);
        }
        return list;
    }

    @Override
    public List<TeacherDto> setTeacherParam() {
        List<TeacherDto> list = new ArrayList<>();
        // 模拟
        for (int i = 0; i < 10; i++) {
            TeacherDto teacherDto = new TeacherDto();
            teacherDto.setName(i + "");
            teacherDto.setAge(i);
            list.add(teacherDto);
        }
        return list;
    }
}
