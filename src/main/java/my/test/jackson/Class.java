package my.test.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * 测试jacksonXml解析
 * 相关资料
 *      https://github.com/FasterXML/jackson-dataformat-xml
 *      https://blog.csdn.net/u014746965/article/details/78647616
 */
@JacksonXmlRootElement(localName = "Class")
public class Class {
    Teacher teacher;//教师

    @JacksonXmlElementWrapper(localName = "All_Students",useWrapping = true)
    @JacksonXmlProperty(localName = "stu")
    List<Student> students;//

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
