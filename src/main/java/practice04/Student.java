package practice04;

public class Student extends Person{
    Integer klass;
    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

}
