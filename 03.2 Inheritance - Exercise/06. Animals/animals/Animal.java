package animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        if (!"Male".equals(gender) && !"Female".equals(gender)) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public static Animal createAnimal(String type, String name, int age, String gender) {
        switch (type) {
            case "Dog":
                return new Dog(name, age, gender);
            case "Frog":
                return new Frog(name, age, gender);
            case "Cat":
                return new Cat(name, age, gender);
            case "Kitten":
                return new Kitten(name, age);
            case "Tomcat":
                return new Tomcat(name, age);
            default:
                throw new IllegalArgumentException("Invalid data!");
        }
    }

    protected abstract String produceSound();

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n", this.getClass().getSimpleName(),
                this.getName(), this.getAge(), this.getGender()) + this.produceSound();
    }
}
