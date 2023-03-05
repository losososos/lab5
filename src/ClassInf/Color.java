package ClassInf;

public enum Color {
    GREEN,
    BLACK,
    YELLOW,
    WHITE;

    @Override
    public String toString(){
        return this.name();
    }
}
