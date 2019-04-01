package nl.deholtmans.jacocomerged;

public class DomainClass {
//    public static void main(String[] args) {
//        DomainClass domainClass = new DomainClass();
//        System.out.println( "Special number is = " + domainClass.unitTestConvert( 234));
//    }
    public int unitTestConvert( int inputNumber) {
        return inputNumber * inputNumber - 2 + 4;
    }
    public int integrationTestConvert( int inputNumber) {
        return inputNumber * inputNumber - 2 + 4;
    }
}
