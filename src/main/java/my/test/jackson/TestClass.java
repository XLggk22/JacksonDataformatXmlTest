package my.test.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    @Test
    public void testXmlSerializ() throws JsonProcessingException {
        ObjectMapper xmlMapper = new XmlMapper();
        Teacher teacher = new Teacher("interesting", "风趣幽默，讨人喜欢", "历史");

        Student stud1 = new Student("1", "张三", "三年级", "9");
        Student stud2 = new Student("1", "李四", "三年级", "10");
        List<Student> students = new ArrayList<Student>();
        students.add(stud1);
        students.add(stud2);

        Class cls = new Class();
        cls.setTeacher(teacher);
        cls.setStudents(students);

        String xmlString = xmlMapper.writeValueAsString(cls);
        System.out.println("xmlString:"+xmlString);
    }

    @Test
    public void testXmlParse() throws IOException {

    }
}
