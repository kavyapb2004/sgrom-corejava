class MedLifePharmaExecutor {

    public static void main(String[] args) {

        boolean createMedicine = MedLifePharma.createMedicine( "Paracetamol", "MedLife Pharma", 50.0, "12-2027","BATCH123","Tablet", 10, false );

        MedLifePharma.getMedicine();
    }
}