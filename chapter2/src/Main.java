public class Main {
    public static void main(String[] args) {
        String user1 = "Suzuki";
        String user2 = "Tanaka";
        int userAge1 = 32;

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user1);
        System.out.println(userAge1);

        Dog dog1 = new Dog("tama");
        Dog dog2 = new Dog("mike");
        Dog dog3 = new Dog("pochi");
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());
        System.out.println(dog3.getName());
    }
}