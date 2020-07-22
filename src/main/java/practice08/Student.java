package practice08;


public class Student extends Person {
    Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at "+this.klass.getDisplayName()+".";
    }
}
