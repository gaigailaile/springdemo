package com.gai.service;

import com.gai.dao.HomeDao;
import com.gai.utils.TransactionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
public class HomeService {
    @Autowired
    private HomeDao homeDao;
    @Autowired
    private TransactionUtils transactionUtils;

//    public void add(String name,String adress,int count){
//        TransactionStatus transaction = transactionUtils.begin();
//        try {
//            for (int i=0;i<count;i++){
//                homeDao.add(name + ":" + i, adress + ":" + i);
//                System.out.println(name+i + "插入成功！");
//                int j = count/i;
//            }
//        }catch (Exception e){
//            transactionUtils.rollback(transaction);
//        }
//        transactionUtils.commit(transaction);
//    }

    public void add(String name,String adress){
        homeDao.add(name + ":" + 1, adress + ":" + 1);
        System.out.println(name+1 + "插入成功！");
        int i = 1/0;
        homeDao.add(name + ":" + 2, adress + ":" + 2);
        System.out.println(name+2 + "插入成功！");
    }

    public void addTry(String name,String adress){
        try{
            homeDao.add(name + ":" + 1, adress + ":" + 1);
            System.out.println(name+1 + "插入成功！");
            int i = 1/0;
            homeDao.add(name + ":" + 2, adress + ":" + 2);
            System.out.println(name+2 + "插入成功！");
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}
