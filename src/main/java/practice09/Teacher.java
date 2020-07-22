package practice09;


public class Teacher extends Person{
    Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
        }
    }

    public String introduceWith(Student student) {
        return student.klass.equals(this.klass) ?
                "My name is Tom. I am 21 years old. I am a Teacher. I teach "+student.getName()+"."
                :
                "My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+"."
                ;
    }
}
