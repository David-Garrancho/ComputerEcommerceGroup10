package za.ac.cput.factory;

import za.ac.cput.domain.Supplier;
import za.ac.cput.domain.SupplierOrder;
import za.ac.cput.util.Helper;

public class SupplierOrderFactory {


    public static SupplierOrder buildSupplierOrder(String dateOfOrder, String expectedDeliveryDate, String actualDeliveryDate, double importTax, double totalCost,
                                                   int productQuantity, double productIndividualPrice, String productID){

        if (Helper.isNullOrEmpty(dateOfOrder) || Helper.isNullOrEmpty(expectedDeliveryDate) || Helper.isNullOrEmpty(actualDeliveryDate)
                || Helper.isNullOrEmpty(productID)) {
            return null;
        }
        if(Helper.isInvalidDouble(importTax) || Helper.isInvalidDouble(totalCost) || Helper.isInvalidDouble(productIndividualPrice)){
            return null;
        }
        if(Helper.isInvalidInt(productQuantity)){
            return null;
        }

        String supplierID = Helper.generateID();
        String orderID = Helper.generateID();

        Helper.isValidDate(actualDeliveryDate);
        Helper.isValidDate(expectedDeliveryDate);
        Helper.isValidDate(dateOfOrder);


        return new SupplierOrder.Builder()
                .setSupplierID(supplierID)
                .setDateOfOrder(dateOfOrder)
                .setExpectedDeliveryDate(expectedDeliveryDate)
                .setActualDeliveryDate(actualDeliveryDate)
                .setImportTax(importTax)
                .setTotalCost(totalCost)
                .setProductQuantity(productQuantity)
                .setProductIndividualPrice(productIndividualPrice)
                .setProductID(productID)
                .setOrderID(orderID)
                .build();

    }

}

