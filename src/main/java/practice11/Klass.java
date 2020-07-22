package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    Integer number;
    Student leader;
    private final Set<Integer> studentMembers;
    public Klass(Set<Integer> studentMembers) {
        this.studentMembers = studentMembers;
    }

    public Klass(Integer number) {
        this.number = number;
        this.studentMembers = new HashSet<>();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public void appendMember(Student student){
        studentMembers.add(student.getId());
    }
    public String getDisplayName() {
        return "Class "+number;
    }
    public void assignLeader(Student student){
        if(this.studentMembers.contains(student.id)){
            this.leader = student;
        }else {
            System.out.println("It is not one of us.");
        }
    }
    public Student getLeader(){
        return this.leader;
    }

}
