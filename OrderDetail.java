import java.util.Date;

public class OrderDetail extends BaseClass{
    private String chemicalName;
    private double price;
    private Date orderDate;

    public OrderDetail(String name, String crop, String chemicalName, double price, Date orderDate){
        super(name, crop);
        this.chemicalName = chemicalName;
        this.price = price;
        this.orderDate = orderDate;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void display(){
        System.out.println("Farm Name: "+ super.getName());
        System.out.println("Crop: "+ super.getCrop());
        System.out.println("Chemical Name: "+ this.chemicalName);
        System.out.println("Total Price: "+ this.price);
        System.out.println("Order Date: "+ this.orderDate);
    }
}
