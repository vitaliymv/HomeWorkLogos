package setqueque.tasktwo;

import java.util.Comparator;

public class CommoditySorting {

    public static class NameComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity c1, Commodity c2) {
            return c1.getName().compareToIgnoreCase(c2.getName());
        }
    }

    public static class WeightComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity c1, Commodity c2) {
            return c1.getWeight().compareTo(c2.getWeight());
        }
    }

    public static class LengthComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity c1, Commodity c2) {
            return c1.getLength().compareTo(c2.getLength());
        }
    }

    public static class WidthComparator implements Comparator<Commodity> {
        @Override
        public int compare(Commodity c1, Commodity c2) {
            return c1.getWidth().compareTo(c2.getWidth());
        }
    }
}
