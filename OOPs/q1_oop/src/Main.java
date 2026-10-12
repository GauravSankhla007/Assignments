public class Main {
    public static void main(String[] args) {

    Ratio r1 = new Ratio_imp(2,5);
    Ratio r2 = new Ratio_imp(5,10);

        Ratio result = r1.add(r2);
        System.out.println(result.getP() + "/" + result.getQ());
        Ratio result_1 = r1.sub(r2);
        System.out.println(result_1.getP() + "/" + result_1.getQ());
        Ratio result_2 = r1.multiply(r2);
        System.out.println(result_2.getP() + "/" + result_2.getQ());
        Ratio result_3 = r1.divide(r2);
        System.out.println(result_3.getP() + "/" + result_3.getQ());
        System.out.println( r1.equal(r2));
        System.out.println( r1.getP());
        System.out.println( r1.getQ());

    }

}