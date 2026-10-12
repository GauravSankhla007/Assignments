public class Ratio_imp implements Ratio{
    private int p;
    private int q;
    @Override
    public int getP(){
        return p;
    }
    @Override
    public int getQ(){
        return q;
    }
    @Override
    public Ratio add(Ratio other) {
        int newP = this.getP() * other.getQ()
                + other.getP() * this.getQ();

        int newQ = this.getQ() * other.getQ();

        return new Ratio_imp(newP, newQ);
    }
    @Override
    public Ratio sub(Ratio other) {
        int newP = this.getP() * other.getQ()
                - other.getP() * this.getQ();

        int newQ = this.getQ() * other.getQ();

        return new Ratio_imp(newP, newQ);
    }
    @Override
    public Ratio multiply(Ratio other) {
        int newP = this.getP() * other.getP();
        int newQ = this.getQ() * other.getQ();

        return new Ratio_imp(newP, newQ);
    }
    @Override
    public boolean equal(Ratio other) {
        return this.getP()*other.getQ()
        == other.getP()*this.getQ();
    }
    @Override
    public Ratio divide(Ratio other) {
        int newP = this.getP() * other.getQ();
        int newQ = this.getQ() * other.getP();

        return new Ratio_imp(newP, newQ);
    }


    Ratio_imp(int p , int q) {
        if (q == 0) {
            throw new IllegalArgumentException("Q cannot be zero");
        }
            this.p = p;
            this.q = q;
        }
}
