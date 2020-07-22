package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass implements JoinSpeaker{
    Integer number;
    Student leader;
    private final Set<Integer> studentMembers;
    Set<JoinListener> listeners = new HashSet<>();
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

    public void appendMember(Student student){
        studentMembers.add(student.getId());
        student.klass = this;
        this.notifyAllListeners(student);
    }

    public boolean isMember(Student student){
        return this.studentMembers.contains(student.id);
    }

    public String getDisplayName() {
        return "Class "+number;
    }
    public void assignLeader(Student student){
        if(this.isMember(student)){
            this.leader = student;
            notifyAllListeners(student);
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Student getLeader(){
        return this.leader;
    }

    @Override
    public void register(JoinListener joinListener) {
        this.listeners.add(joinListener);
    }

    @Override
    public void unregister(JoinListener joinListener) {
        this.listeners.remove(joinListener);
    }

    public void notifyAllListeners(Student student) {
        this.listeners.forEach(listener ->{
            listener.update(student);
        });
    }
}
