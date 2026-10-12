public interface Ratio {
    public Ratio add(Ratio other);
    public Ratio sub(Ratio other);
    public Ratio multiply(Ratio other);
    public boolean equal(Ratio other);
    public Ratio divide(Ratio other);
    int getP();
    int getQ();


}
