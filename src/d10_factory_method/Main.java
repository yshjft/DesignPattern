package d10_factory_method;

import d10_factory_method.creator.FranceShoesStore;
import d10_factory_method.creator.JapanShoesStore;
import d10_factory_method.creator.ShoesStore;
import d10_factory_method.product.Shoes;

public class Main {
    public static void main(String[] args) {
        ShoesStore japanShoesStore = new JapanShoesStore();
        ShoesStore franceShoesStore = new FranceShoesStore();

        Shoes shoes1 = japanShoesStore.orderShoes("blackShoes");
        System.out.println(shoes1.getName());

        Shoes shoes2 = franceShoesStore.orderShoes("blackShoes");
        System.out.println(shoes2.getName());

    }
}
