package practice07;

public class Teacher extends Person{
    Klass klass;
    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
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
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            return super.introduce()+" I am a Teacher. I teach "+this.klass.getDisplayName()+".";
        }
    }
}
