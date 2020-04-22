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

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals("")) throw new IllegalArgumentException("FirstName is not defined");
        this.firstName = firstName;
    }
    public void setSurname(String surname) {
        if (surname == null || surname.equals("")) throw new IllegalArgumentException("Surname is not defined");
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        if (patronymic == null || patronymic.equals(""))
            throw new IllegalArgumentException("Patronymic is not defined");
        this.patronymic = patronymic;
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
