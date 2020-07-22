package practice06;

public class Teacher extends Person{
    Integer klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            return super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
        }
    }
}
