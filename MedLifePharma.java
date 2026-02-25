class MedLifePharma {

    static String medicineName;
    static String manufacturer;
    static double price;
    static String expiryDate;
    static String batchNumber;
    static String type; // Tablet / Syrup / Injection
    static int quantity;
    static boolean isPrescriptionRequired;

    public static boolean createMedicine(String medName, String manu,double medPrice, String expDate,String batchNo, String medType,int qty, boolean prescriptionRequired) {

                                         
                                         
                                         
        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isManufacturerValid = false;
        boolean isPriceValid = false;
        boolean isExpiryValid = false;
        boolean isBatchValid = false;
        boolean isTypeValid = false;
        boolean isQuantityValid = false;
        boolean isPrescriptionValid = false;

        if (medName != null && !medName.isEmpty()) {
            medicineName = medName;
            isNameValid = true;
        } else {
            System.out.println("Medicine name not valid");
        }

        if (manu != null && !manu.isEmpty()) {
            manufacturer = manu;
            isManufacturerValid = true;
        } else {
            System.out.println("Manufacturer not valid");
        }

        if (medPrice > 0) {
            price = medPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price not valid");
        }

        if (expDate != null && !expDate.isEmpty()) {
            expiryDate = expDate;
            isExpiryValid = true;
        } else {
            System.out.println("Expiry date not valid");
        }

        if (batchNo != null && !batchNo.isEmpty()) {
            batchNumber = batchNo;
            isBatchValid = true;
        } else {
            System.out.println("Batch number not valid");
        }

        if (medType != null && !medType.isEmpty()) {
            type = medType;
            isTypeValid = true;
        } else {
            System.out.println("Medicine type not valid");
        }

        if (qty > 0) {
            quantity = qty;
            isQuantityValid = true;
        } else {
            System.out.println("Quantity not valid");
        }

        isPrescriptionRequired = prescriptionRequired;
        isPrescriptionValid = true;

        if (isNameValid && isManufacturerValid && isPriceValid &&
            isExpiryValid && isBatchValid && isTypeValid &&
            isQuantityValid && isPrescriptionValid) {

            isCreated = true;
        }

        return isCreated;
    }

    public static void getMedicine() {
        System.out.println("Fetching Medicine Details...........");
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Price : " + price);
        System.out.println("Expiry Date : " + expiryDate);
        System.out.println("Batch Number : " + batchNumber);
        System.out.println("Type : " + type);
        System.out.println("Quantity : " + quantity);
        System.out.println("Prescription Required : " + isPrescriptionRequired);
    }
}