package Book.dog;

public class PitomnikSobak {
    public static void main(String[] args) {
        Dog b1 = new Dog("Barbos", 4);
        Dog b2 = new Dog("Bim", 4);
        Dog b3 = new Dog("Muhtar");

        b3.setAge(5);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(" ");

        b1.humanAge();
        b2.humanAge();
        b3.humanAge();

        System.out.println(" ");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
