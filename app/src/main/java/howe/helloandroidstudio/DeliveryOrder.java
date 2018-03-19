package howe.helloandroidstudio;

import java.util.Date;

/**
 * Created by Howe on 2017/2/25.
 */

public class DeliveryOrder {

    private String OrderNo;

    private double TotalQty;

    private double TotalPrice;

    private Date EntryDateTime;

    private Boolean IsActived;

    public Boolean getActived() {
        return IsActived;
    }

    public void setActived(Boolean actived) {
        IsActived = actived;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public double getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(double totalQty) {
        TotalQty = totalQty;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public Date getEntryDateTime() {
        return EntryDateTime;
    }

    public void setEntryDateTime(Date entryDateTime) {
        EntryDateTime = entryDateTime;
    }


}
