public class Name {
    String firstName;
    String surname;
    String patronymic;

    @Override
    public String toString() {
        String FIO = "";
        FIO += firstName == null ? "" : (firstName);
        FIO += patronymic == null ? "" : (" " + patronymic);
        FIO += surname == null ? "" : (" " + surname);
        return FIO;
    }
}
