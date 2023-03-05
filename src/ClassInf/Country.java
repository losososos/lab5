package ClassInf;

public enum Country {
    FRANCE,
    INDIA,
    VATICAN,
    ITALY;

    @Override
    public String toString(){
        return this.name();
    }
}
