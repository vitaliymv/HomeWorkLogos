package setqueque.tasktwo;

import setqueque.InputParameters;

import java.util.ArrayList;
import java.util.List;

class Commodity {

    private final static List<Commodity> commodity = new ArrayList<>();

    private String name;
    private Integer weight;
    private Integer length;
    private Integer width;

    Commodity(String name, int weight, int length, int width) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    String getName() {
        return name;
    }

    Integer getWeight() {
        return weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    Integer getWidth() {
        return width;
    }

    void addCommodity() {
        Commodity com = addParametersCommodity();
        commodity.add(com);
    }

    private Commodity addParametersCommodity() {
        System.out.print("Enter the name commodity: ");
        String name = InputParameters.getString();
        System.out.print("Enter the weight commodity: ");
        int weight = InputParameters.getInt();
        System.out.print("Enter the length commodity: ");
        int length = InputParameters.getInt();
        System.out.print("Enter the width commodity: ");
        int width = InputParameters.getInt();
        return new Commodity(name, weight, length, width);
    }

    void deleteCommodity() {
        Commodity com = addParametersCommodity();
        commodity.remove(com);
    }

    void replaceCommodity() {
        Commodity com = addParametersCommodity();
        commodity.remove(com);
        commodity.add(addParametersCommodity());
    }

    void sortName() {
        commodity.sort(new CommoditySorting.NameComparator());
        System.out.println(commodity);
    }

    void sortLength() {
        commodity.sort(new CommoditySorting.LengthComparator());
        System.out.println(commodity);
    }

    void sortWidth() {
        commodity.sort(new CommoditySorting.WidthComparator());
        System.out.println(commodity);
    }

    void sortWeight() {
        commodity.sort(new CommoditySorting.WeightComparator());
        System.out.println(commodity);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

}
