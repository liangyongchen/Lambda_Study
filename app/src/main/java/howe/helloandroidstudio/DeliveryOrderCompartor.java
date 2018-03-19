package howe.helloandroidstudio;

import java.util.Comparator;

/**
 * Created by Howe on 2017/2/25.
 */

public class DeliveryOrderCompartor implements Comparator<DeliveryOrder> {


    @Override
    public int compare(DeliveryOrder lhs, DeliveryOrder rhs) {
        int result1 = new Double(lhs.getTotalPrice()).compareTo(new Double(rhs.getTotalPrice()));
        if (result1 == 0) {
            return lhs.getOrderNo().compareTo(rhs.getOrderNo());
        } else {
            return result1;
        }
    }

    public static int Comparing(DeliveryOrder lhs, DeliveryOrder rhs) {
        int result1 = new Double(lhs.getTotalPrice()).compareTo(new Double(rhs.getTotalPrice()));
        if (result1 == 0) {
            return lhs.getOrderNo().compareTo(rhs.getOrderNo()) * -1; // 单号的倒序
        } else {
            return result1;
        }
    }
}
