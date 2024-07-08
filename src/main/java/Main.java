public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        Medication medicationOne = new Medication("Paracetamol", 5.99, true);
        Medication medicationTwo = new Medication("Ibuprofen", 7.99, true);
        Medication medicationThree = new Medication("Amoxicillin", 12.99, false);

        pharmacy.save(medicationOne);
        pharmacy.save(medicationTwo);
        pharmacy.save(medicationThree);

        pharmacy.printMedications();
    }
}
