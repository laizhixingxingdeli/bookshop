package com.service;

import com.bean.Order;
import com.bean.Page;

import java.util.List;

public interface OrderService {
    public boolean addOrder(Order order);
    public List<Order> queryOrderByUid(int uid);
    public Page queryOrdersByOstatus(int status, int pageNumber);
    public boolean updateOrderStatus(String oid,int ostatus);
    public boolean deleteOrderByOid(String oid);
}
