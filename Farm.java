import java.util.Date;

public class Farm extends BaseClass{
    private double width;
    private double length;
    private Date lastSprayed;
    private double areaInHectare;
    
    public Farm(String name, double width, double length, String crop, Date lastSprayed){
        super(name, crop);
        this.width = width;
        this.length = length;
        this.lastSprayed = lastSprayed;
        this.areaInHectare = 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Date getLastSprayed() {
        return lastSprayed;
    }

    public void setLastSprayed(Date lastSprayed) {
        this.lastSprayed = lastSprayed;
    }

    public double getAreaInHectare() {
        return areaInHectare;
    }

    public void setAreaInHectare(double areaInHectare) {
        this.areaInHectare = areaInHectare;
    }

    public void display(){
        System.out.println("Name: "+ super.getName());
        System.out.println("Length: "+ this.getLength());
        System.out.println("Width: "+ this.getWidth());
        System.out.println("Crop: "+ super.getCrop());
        System.out.println("Last Sprayed: "+ this.getLastSprayed());
        System.out.println("Area in Hectare: "+ this.getAreaInHectare());
    }
}
