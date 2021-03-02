import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Calendar;
import java.util.Comparator;

public class AppleTree{
    public List<Farm> setFarmData(){
        List<Farm> farmData = new ArrayList<Farm>();
        farmData.add(new Farm("Cowfield", 300, 400, "Barley", new Date(2021 - 1900, 1, 18)));
        farmData.add(new Farm("Top", 200, 600, "Barley", new Date(2020 - 1900, 11, 22)));
        farmData.add(new Farm("Hillside", 600, 400, "Winter Wheat", new Date(2021 - 1900, 1, 5)));
        farmData.add(new Farm("Big Field", 800, 500, "Sugar Beet", new Date(2021 - 1900, 0, 9)));
        farmData.add(new Farm("Upper River", 200, 200, "Barley", new Date(2021 - 1900, 0, 18)));
        farmData.add(new Farm("Lower River", 500, 100, "Sugar Beet", new Date(2021 - 1900, 1, 8)));
        farmData.add(new Farm("Southside", 400, 400, "Winter Wheat", new Date(2021 - 1900, 0, 12)));

        return farmData;
    }

    public List<Chemical> setChemicalData(){
        List<Chemical> chemicalData = new ArrayList<Chemical>();
        chemicalData.add(new Chemical("Ryezapon", "Winter Wheat", 240, 6));
        chemicalData.add(new Chemical("Berbelikar", "Barley", 156, 4));
        chemicalData.add(new Chemical("Quadranis", "Sugar Beet", 191, 9));

        return chemicalData;
    }

    public List<OrderDetail> setOrderList(List<Farm> farmList, List<Chemical> chemicalList){
        List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
        Map<String, Chemical> chemicalMap = new Convert().covertChemicalListIntoMap(chemicalList);
        Calendar calendar = Calendar.getInstance();

        for(Farm farm: farmList){
            Chemical chemical = chemicalMap.get(farm.getCrop());

            double price = farm.getAreaInHectare() * chemical.getPrice();

            calendar.setTime(farm.getLastSprayed());
            calendar.add(Calendar.WEEK_OF_YEAR, chemical.getApplicationFrequenceWeek());

            OrderDetail orderDetail = new OrderDetail(farm.getName(), farm.getCrop(), chemical.getName(), price, calendar.getTime());
            orderDetailList.add(orderDetail);
        }

        return  orderDetailList;
    }

    public void displayOrderList(List<OrderDetail> orderDetailsList){
        for(OrderDetail orderDetail: orderDetailsList){
            System.out.println();
            orderDetail.display();
        }
    }

    public static void main(String args[]){
        AppleTree appleTree = new AppleTree();

        List<Farm> farmList = appleTree.setFarmData();
        List<Chemical> chemicalList = appleTree.setChemicalData();
        List<OrderDetail> orderDetailList = appleTree.setOrderList(farmList, chemicalList);

        orderDetailList.sort(Comparator.comparing(o -> o.getOrderDate()));
        appleTree.displayOrderList(orderDetailList);
    }
}
