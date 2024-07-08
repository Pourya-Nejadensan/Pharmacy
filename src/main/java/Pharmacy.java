import java.util.Map;

public class Pharmacy {
    private Map<String,Medication> medications;

    public int getCount(){
        return medications.size();
    }

    public void save(Medication medication){
            medications.put(medication.getName(), medication);
    }

    public Medication findMedication(String medicationName){
        return medications.get(medicationName);
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
    }
}
