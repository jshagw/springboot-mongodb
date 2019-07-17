package com.gw.mongodemo;

import com.gw.mongodemo.dao.UserDao;
import com.gw.mongodemo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodemoApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void addUser() {
        User user = new User("2", "Neil", 6, "男");
        userDao.insert(user);
    }

    @Test
    public void findByID() {
        Optional<User> user = userDao.findById("2");
        if ( user.isPresent() ) {
            System.out.println(user.get().getName());
        }
    }

    @Test
    public void findByName() {
        User u = new User();
        u.setName("Neil");
        u.setAge(5);
        Optional<User> user = userDao.findOne(Example.of(u));
        //Optional<User> user = userDao.findByName("Neil");
        if ( user.isPresent() ) {
            System.out.println("Neil's id is " + user.get().getId());
        } else {
            System.out.println("not found Neil");
        }
    }

    @Test
    public void contextLoads() {
        List<User> users = userDao.findAll();
        for (User u : users) {
            System.out.println(u.getId() + u.getName() + u.getSex() + u.getAge());
        }
    }

}
