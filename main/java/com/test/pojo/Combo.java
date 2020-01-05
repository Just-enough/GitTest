package com.test.pojo;

import java.util.List;

/**
 * @author lg
 * @version 1.0
 * @since 1.8
 */
public class Combo {
    private Torder torder;
    private int[] ids;
    private List<Torder> orderList;
    public int[] getIds() {
        return ids;
    }

    public List<Torder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Torder> orderList) {
        this.orderList = orderList;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public Torder getTorder(){
        return  torder;
    }
    public void setTorder(Torder torder){
        this.torder=torder;
    }
}
