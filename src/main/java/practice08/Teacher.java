package practice08;


public class Teacher extends Person{
    Klass klass;
    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
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
}
