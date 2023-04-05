package java.za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.CheckOut;
import za.ac.cput.factory.CheckOutFactory;

class CheckOutFactoryTest {

    @Test
    void createCheckOut() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", 5, 4500.00, 22500.00, 3375);
        System.out.println(checkOut.toString());
        assertNotNull(checkOut);
    }

    @Test
    void emptyParametersProductName() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("", 5, 4500.00, 22500.00, 3375);
        assertNull(checkOut);
    }

    @Test
    void invalidParametersProductQuantity() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", -5, 4500.00, 22500.00, 3375);
        assertNull(checkOut);
    }

    @Test
    void invalidParametersProductPrice() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", 5, -4500.00, 22500.00, 3375);
        assertNull(checkOut);
    }

    @Test
    void invalidParametersTotalPrice() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", 5, 4500.00, -22500.00, 3375);
        assertNull(checkOut);
    }

    @Test
    void invalidParametersTax() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", 5, 4500.00, 22500.00, -3375);
        assertNull(checkOut);
    }

    @Test
    void testEquality() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", 5, 4500.00, 22500.00, 3375);
        CheckOut checkOut1 = CheckOutFactory.buildCheckOut("GTX650", 2, 2250.00, 4500.00, 675);
        System.out.println(checkOut.toString());
        System.out.println(checkOut1.toString());
        assertNotEquals(checkOut, checkOut1);
    }

    @Test
    void testEquality() {
        CheckOut checkOut = CheckOutFactory.buildCheckOut("GTX850", 5, 4500.00, 22500.00, 3375);
        CheckOut checkOut1 = checkOut;
        System.out.println(checkOut.toString());
        assertNotEquals(checkOut, checkOut1);
    }


}