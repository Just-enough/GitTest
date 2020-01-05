package com.test.service;

import com.test.dao.TorderMapper;
import com.test.pojo.Torder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lg
 * @version 1.0
 * @since 1.8
 */
@Service
public class OrderService {
    @Autowired
    TorderMapper torderMapper;
    @Transactional
    public List<Torder> getList(){
        return torderMapper.selectByExample(null);
    }
    public Torder getOrderById(int key){
        return torderMapper.selectByPrimaryKey(key);
    }
    @Transactional
    public void updateOrder(Torder torder){
        torderMapper.updateByPrimaryKey(torder);
    }
    @Transactional
    public void deleteOrder(int[] ids){

    }
}
