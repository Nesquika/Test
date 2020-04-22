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

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    Name(String firstName) {
        this.firstName = firstName;
    }
    Name(String firstName, String surname){
        this(firstName);
        this.surname = surname;
    }
    Name(String firstName, String patronymic, String surname){
        this(firstName, surname);
        this.patronymic = patronymic;
    }
}
