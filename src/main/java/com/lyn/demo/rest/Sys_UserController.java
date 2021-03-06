package com.lyn.demo.rest;

import com.lyn.demo.domain.Sys_User;
import com.lyn.demo.repository.Sys_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("Sys_User")
public class Sys_UserController {
    @Autowired
    private Sys_UserRepository userRepository;

    @RequestMapping("/Save")
    public Sys_User test(){
        Sys_User sys_user = new Sys_User();
        sys_user.setName("价格部分");
        userRepository.save(sys_user);
        return sys_user;
    }


    @RequestMapping("/findById")
    public Sys_User findById(Long id){
        Optional<Sys_User> sys_user = userRepository.findById(id);
        return sys_user.get();
    }

    @RequestMapping("/findByNameLike")
    public List<Sys_User> findById(String name){
        String nameLike = "%"+name+"%";
        List<Sys_User> list = userRepository.findByNameLike(nameLike);
        return list;
    }

    @RequestMapping("/findByUserId")
    public List<Map> findByUserId(Long UserId){
        List<Map> list = userRepository.findByUserId(UserId);
        return list;
    }

    @RequestMapping("/findByUserIdByPage")
    public Page<Map> findByUserIdByPage(Long UserId){
        Page<Map> list = userRepository.findByUserId(UserId,PageRequest.of(1,2));
        return list;
    }
}
