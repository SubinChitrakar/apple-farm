import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Convert{
    public static double convertMeterToHectare(double areaInMeter){
        return areaInMeter/10000;
    }

    public static Map<String, Chemical> covertChemicalListIntoMap(List<Chemical> chemicalList){
        Map<String, Chemical> chemicalMap = new HashMap<String, Chemical>();

        for(Chemical chemical : chemicalList){
            chemicalMap.put(chemical.getCrop(), chemical);
        }

        return chemicalMap;
    }
}
