public class Dog {
    private String name;
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) { //引数　
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
