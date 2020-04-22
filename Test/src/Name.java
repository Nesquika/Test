public class Name {
    private String firstName;
    private String surname;
    private String patronymic;

    @Override
    public String toString() {
        String FIO = "";
        FIO += firstName == null ? "" : (firstName);
        FIO += patronymic == null ? "" : (" " + patronymic);
        FIO += surname == null ? "" : (" " + surname);
        return FIO;
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }
    public Name(String firstName, String surname){
        this(firstName);
        this.surname = surname;
    }
    public Name(String firstName, String patronymic, String surname){
        this(firstName, surname);
        this.patronymic = patronymic;
    }
}
