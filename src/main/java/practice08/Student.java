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
        String result = super.introduce()+" I am a Student. ";
        if(this.equals(this.klass.leader)){
            return result+"I am Leader of "+this.klass.getDisplayName()+".";
        }else {
            return result+"I am at "+this.klass.getDisplayName()+".";
        }

    }
}
