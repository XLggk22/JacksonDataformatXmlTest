package my.test.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Student")
public class Student {

    @JacksonXmlProperty(isAttribute = true, localName = "stu_id")
    private String id;  //学号---属性

    @JacksonXmlProperty(localName = "xingMing")
    private String name;

    @JacksonXmlProperty(localName = "nianJi")
    private String gender;

    @JacksonXmlProperty(localName = "nianLing")
    private String age;

    public Student() {
    }

    public Student(String id, String name, String gender, String age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
