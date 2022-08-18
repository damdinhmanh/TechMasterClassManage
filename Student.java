package Class_Management;

public class Student {
    private String id;
    private String name;
    private int age;
    private String level;

    public Student(String id, String name, int age, String level) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", id=" + id + ", level=" + level + ", name=" + name + "]";
    }
}
