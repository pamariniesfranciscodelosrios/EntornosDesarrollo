package dam.ed;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}