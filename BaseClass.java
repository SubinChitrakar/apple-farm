public class BaseClass{
    private String name;
    private String crop;

    public BaseClass(String name, String crop){
        this.name = name;
        this.crop = crop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }
}
