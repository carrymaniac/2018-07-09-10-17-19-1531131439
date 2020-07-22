package practice08;

public class Klass {
    Integer number;
    Student leader;
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
    public void assignLeader(Student student){
        this.leader = student;
    }
    public Student getLeader(){
        return this.leader;
    }
}
