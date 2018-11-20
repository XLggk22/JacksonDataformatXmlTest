package my.test.jackson;


public class Teacher {
    private String type;//类型    讲课的风格，有趣还是无趣
    private String value;//值
    private String subject;//科目

    public Teacher() {
    }

    public Teacher(String type, String value, String subject) {
        this.type = type;
        this.value = value;
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
