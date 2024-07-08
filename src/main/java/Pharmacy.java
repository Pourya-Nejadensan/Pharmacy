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

    public void printMedications(){
        for(Map.Entry<String,Medication> entry : medications.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().getName()
                    + ", " + entry.getValue().getAvailability()
                    + ", " + entry.getValue().getPrice());
        }
    }
}
