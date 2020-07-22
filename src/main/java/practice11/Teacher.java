package practice11;

import practice09.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> classes = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
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

//    public String introduceWith(Student student) {
//        return student.klass.equals(this.klass) ?
//                "My name is Tom. I am 21 years old. I am a Teacher. I teach "+student.getName()+"."
//                :
//                "My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+"."
//                ;
//    }
}
