public class Task {
    int num;
    Priority priority;

    public Task(int num, Priority priority) {
        this.num = num;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "num=" + num +
                ", priority=" + priority +
                '}';
    }

    public Priority getPriority() {
        return priority;
    }
}
