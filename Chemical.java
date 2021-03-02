import java.util.Date;

public class Chemical{
    private String name;
    private String cropUsage;
    private double price;
    private double applicationFrequenceWeek;

    public Chemical(String name, String cropUsage, double price, double applicationFrequenceWeek){
        this.name = name;
        this.cropUsage = cropUsage;
        this.price = price;
        this.applicationFrequenceWeek = applicationFrequenceWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCropUsage() {
        return cropUsage;
    }

    public void setCropUsage(String cropUsage) {
        this.cropUsage = cropUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getApplicationFrequenceWeek() {
        return applicationFrequenceWeek;
    }

    public void setApplicationFrequenceWeek(double applicationFrequenceWeek) {
        this.applicationFrequenceWeek = applicationFrequenceWeek;
    }

    public void display(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Crop Usage: "+ this.getCropUsage());
        System.out.println("Price: "+ this.getPrice());
        System.out.println("Application Frequency: "+ this.getApplicationFrequenceWeek());
    }
}
