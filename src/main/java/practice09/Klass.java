package practice09;

import practice08.Student;

public class Klass {
    Integer number;
    practice08.Student leader;
    public Klass() {
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }
    public void assignLeader(practice08.Student student){
        this.leader = student;
    }
    public Student getLeader(){
        return this.leader;
    }
}
