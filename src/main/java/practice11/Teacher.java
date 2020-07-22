package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person implements JoinListener{
    private List<Klass> classes = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.stream().forEach(klass -> {
            klass.register(this);
        });
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }
    @Override
    public String introduce() {
        if (classes.size()==0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String collect = classes.stream().map(klass -> String.valueOf(klass.number)).collect(Collectors.joining(", "));
            return super.introduce() + " I am a Teacher. I teach Class " + collect + ".";
        }
    }
    public boolean isTeaching(Student student){
        for (Klass klass:classes) {
            if(klass.isMember(student)){
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        return isTeaching(student) ?
                "My name is Tom. I am 21 years old. I am a Teacher. I teach "+student.getName()+"."
                :
                "My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+"."
                ;
    }

    @Override
    public void update(Student student) {
        if(student.klass.getLeader()==student){
            String str = String.format("I am %s. I know %s become Leader of Class %s.",this.name,student.name,student.klass.number);
            System.out.print(str+"\n");
            return;
        }
        String str = String.format("I am %s. I know %s has joined Class %s.",this.name,student.name,student.klass.number);
        System.out.print(str+"\n");
    }
}
