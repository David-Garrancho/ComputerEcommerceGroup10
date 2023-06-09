package za.ac.cput.domain;

/*
    POJO for the Supplier
    Author: Ethan Andrew Botes (220101299)
    Date: 6 April 2023
*/

import java.util.Objects;

public class Supplier {

    public String supplierID;
    private String supplierCompanyName;
    private String supplierTel;
    private String supplierEmail;
    private String supplierAddress;
    private String supplierProductLine;

    public Supplier() {

    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierCompanyName() {
        return supplierCompanyName;
    }

    public String getSupplierTel() {
        return supplierTel;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public String getSupplierProductLine() {
        return supplierProductLine;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierID, supplier.supplierID) && Objects.equals(supplierCompanyName, supplier.supplierCompanyName) && Objects.equals(supplierTel, supplier.supplierTel) && Objects.equals(supplierEmail, supplier.supplierEmail) && Objects.equals(supplierAddress, supplier.supplierAddress) && Objects.equals(supplierProductLine, supplier.supplierProductLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierID, supplierCompanyName, supplierTel, supplierEmail, supplierAddress, supplierProductLine);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierID='" + supplierID + '\'' +
                ", supplierCompanyName='" + supplierCompanyName + '\'' +
                ", supplierTel='" + supplierTel + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", supplierProductLine='" + supplierProductLine + '\'' +
                '}';
    }


    public Supplier(Supplier.Builder b){

        this.supplierID = b.supplierID;
        this.supplierCompanyName = b.supplierCompanyName;
        this.supplierTel = b.supplierTel;
        this.supplierEmail = b.supplierEmail;
        this.supplierAddress = b.supplierAddress;
        this.supplierProductLine = b.supplierProductLine;

    }



    public static class Builder{

        public String supplierID;
        private String supplierCompanyName;
        private String supplierTel;
        private String supplierEmail;
        private String supplierAddress;
        private String supplierProductLine;

        public Builder setSupplierID(String supplierID) {
            this.supplierID = supplierID;
            return this;
        }

        public Builder setSupplierCompanyName(String supplierCompanyName) {
            this.supplierCompanyName = supplierCompanyName;
            return this;
        }

        public Builder setSupplierTel(String supplierTel) {
            this.supplierTel = supplierTel;
            return this;
        }

        public Builder setSupplierEmail(String supplierEmail) {
            this.supplierEmail = supplierEmail;
            return this;
        }

        public Builder setSupplierAddress(String supplierAddress) {
            this.supplierAddress = supplierAddress;
            return this;
        }

        public Builder setSupplierProductLine(String supplierProductLine) {
            this.supplierProductLine = supplierProductLine;
            return this;
        }



        public Builder copy(Supplier supplier){

            this.supplierID = supplier.supplierID;
            this.supplierCompanyName = supplier.supplierCompanyName;
            this.supplierTel = supplier.supplierTel;
            this.supplierEmail = supplier.supplierEmail;
            this.supplierAddress = supplier.supplierAddress;
            this.supplierProductLine = supplier.supplierProductLine;
            return this;
        }

        public Supplier build(){return new Supplier(this);}




    }




}
