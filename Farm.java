import java.util.Date;

public class Farm{
    private String name;
    private double width;
    private double length;
    private String crop;
    private Date lastSprayed;
    private double areaInHectare;
    
    public Farm(String name, double width, double length, String crop, Date lastSprayed){
        this.name = name;
        this.width = width;
        this.length = length;
        this.crop = crop;
        this.lastSprayed = lastSprayed;
        this.areaInHectare = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
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
        System.out.println("Name: "+ this.getName());
        System.out.println("Length: "+ this.getLength());
        System.out.println("Width: "+ this.getWidth());
        System.out.println("Crop: "+ this.getCrop());
        System.out.println("Last Sprayed: "+ this.getLastSprayed());
        System.out.println("Area in Hectare: "+ this.getAreaInHectare());
    }
}
