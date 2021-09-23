package patterns.observer;

public interface Observer {
    //method to update the patterns.observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
