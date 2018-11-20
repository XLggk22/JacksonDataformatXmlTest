package my.test.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;

import java.io.IOException;

public class TestStudent {
    @Test
    public void testXmlSerializ() throws JsonProcessingException {
        ObjectMapper xmlMapper = new XmlMapper();
        String xmlString = xmlMapper.writeValueAsString(new Student("1", "张三", "三年级", "9"));
        System.out.println("xmlString:"+xmlString);
    }

    @Test
    public void testXmlParse() throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        String xmlString = "<Student stu_id=\"1\"><xingMing>张三</xingMing><nianJi>三年级</nianJi><nianLing>9</nianLing></Student>";
        Student student = xmlMapper.readValue(xmlString, Student.class);
        System.out.println("student:"+student.toString());
    }
}
