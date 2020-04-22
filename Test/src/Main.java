public class Main {

    public static void main(String[] args) {
        Name n1 = new Name();
        n1.firstName = "Cleopatra";
        Name n2 = new Name();
        n2.firstName = "Alexander";
        n2.patronymic = "Sergeevich";
        n2.surname = "Pushkin";
        Name n3 = new Name();
        n3.firstName = "Vladimir";
        n3.surname = "Mayakovsky";

        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n");
    }
}
