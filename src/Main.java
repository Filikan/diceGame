public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="Furkan";

        Student s2 = new Student();
        s2.name="Kadir";

        Dice dice = new Dice();

        s1.getName(s1);
        dice.Roll();

        s2.getName(s2);
        dice.Roll();
    }
}
