package nl.deholtmans.jacocomerged.it;

import nl.deholtmans.jacocomerged.DomainClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DomainClassIntegrationTest {
    @Test
    public void testUnitIntegrationTestOne() {
        DomainClass domainClass = new DomainClass();
        assertEquals(15131, domainClass.integrationTestConvert(123));
    }

    @Test
    public void testUnitIntegrationTestTwo() {
        DomainClass domainClass = new DomainClass();
        assertEquals(15131, domainClass.integrationTestConvert(123));
    }
}
