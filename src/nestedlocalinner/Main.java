package nestedlocalinner;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();
        Collection.InClassFirst classFirst = new Collection.InClassFirst();
        collection.createCollection();
        classFirst.next();
        System.out.println();
        Collection.InClassSecond classSecond = new Collection.InClassSecond();
        classSecond.next();
        System.out.println();

    }


}
