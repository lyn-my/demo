package com.lyn.demo.service;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.lyn.demo.domain.Demo;
import com.lyn.demo.domain.Sys_User;
import com.lyn.demo.repository.Sys_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
//@Transactional
public class Sys_UserService {

    @Autowired
    private Sys_UserRepository userRepository;

    @Transactional
    public void savePl() {

        Sys_User sys_user;
        for(int i =0 ;i<1000;i++){
            sys_user = new Sys_User();
            sys_user.setName("价格部分>>"+i);
            userRepository.save(sys_user);
        }
        //userRepository.saveAll()

    }

    @Transactional
    public void savePlTWO() {

        Sys_User sys_user;
//        Iterable<Sys_User> i = new ArrayIterator<Sys_User>();
        Collection<Sys_User> list = new ArrayList();
        for(int i =0 ;i<1000;i++){
            sys_user = new Sys_User();
            sys_user.setName("价格部分>>"+i);
            list.add(sys_user);
        }

        userRepository.saveAll(list);
    }


    @Transactional
    public void savePl3() {
        Sys_User sys_user;
        Collection<Sys_User> list = new ArrayList();
        for(int i =0 ;i<1000;i++){
            sys_user = new Sys_User();
            sys_user.setName("价格部分>>"+i);
            list.add(sys_user);
        }


        userRepository.saveAll(list);
    }
}
