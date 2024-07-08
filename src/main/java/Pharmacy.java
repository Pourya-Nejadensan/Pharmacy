import java.util.Map;

public class Pharmacy {
    private Map<String,Medication> medications;

    public int getCount(){
        return medications.size();
    }
}
