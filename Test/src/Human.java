public class Human {
    private String name;
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
}
