package _12_javacolection_framework.bai_tap;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else {
            return -1;
        }
    }
}
