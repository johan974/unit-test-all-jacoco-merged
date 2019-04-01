package nl.deholtmans.jacocomerged.ut;

import nl.deholtmans.jacocomerged.DomainClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DomainClassTest {
    @Test
    public void testUnitTestOne() {
        DomainClass domainClass = new DomainClass();
        assertEquals(15131, domainClass.unitTestConvert(123));
    }
}
