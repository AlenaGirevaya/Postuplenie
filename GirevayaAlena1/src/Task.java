public class Task {
    public String name;
    public String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }

    public String getName() {
        return name;
    }
}
