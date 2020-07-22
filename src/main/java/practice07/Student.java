package practice07;

public class Student extends Person{
    Klass klass;
    public Student(String name, Integer age) {
        super(name, age);
    }

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
