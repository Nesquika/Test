public class Human {
    private Name name;
    private int height;
    private Human father;

    @Override
    public String toString() {
        return name + ", " + height;
    }

    public void setHeight(int height) {
        if(height > 0 && height < 500) this.height = height;
        else throw new IllegalArgumentException("Height is out of range (0;500)");
    }

    public int getHeight() {
        return height;
    }

    public Human getFather() {
        return father;
    }

    public Human(){}
    public Human(String name, int height) {
        this(new Name(name), height, null);
    }
    public Human(String name, int height, Human father) {
        this(new Name(name), height, father);
    }
    public Human(Name name, int height) {
        this(name, height, null);
    }
    public Human(Name name, int height, Human father) {
        if (father != null) {
            if (name.getSurname() == null && father.name.getSurname() != null)
                name.setSurname(father.name.getSurname());
            if (father.name.getFirstName() != null && name.getPatronymic() == null) {
                String fatherName = father.name.getFirstName();
                if (fatherName.substring(fatherName.length() - 2).equals("ey"))
                    name.setPatronymic(fatherName.substring(0, fatherName.length() - 1) + "evich");
                else name.setPatronymic(fatherName + "ovich");
            }
        }
        this.name = name;
        this.father = father;
        setHeight(height);
    }
}
