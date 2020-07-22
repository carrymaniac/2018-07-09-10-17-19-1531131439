package practice11;

public interface JoinSpeaker {
    void register(JoinListener joinListener);
    void unregister(JoinListener joinListener);
}
