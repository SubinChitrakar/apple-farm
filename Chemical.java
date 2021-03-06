import java.util.Date;

public class Chemical extends BaseClass{
    private double price;
    private int applicationFrequenceWeek;

    public Chemical(String name, String cropUsage, double price, int applicationFrequenceWeek){
        super(name, cropUsage);
        this.price = price;
        this.applicationFrequenceWeek = applicationFrequenceWeek;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getApplicationFrequenceWeek() {
        return applicationFrequenceWeek;
    }

    public void setApplicationFrequenceWeek(int applicationFrequenceWeek) {
        this.applicationFrequenceWeek = applicationFrequenceWeek;
    }

    public void display(){
        System.out.println("Name: "+ super.getName());
        System.out.println("Crop Usage: "+ super.getCrop());
        System.out.println("Price: "+ this.getPrice());
        System.out.println("Application Frequency: "+ this.getApplicationFrequenceWeek());
    }
}
