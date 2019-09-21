package com.wys;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wys.mapper.UserMapper;
import com.wys.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatisplus01ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
    }
//根据id查询数据，或者根据表中其他字段来查询数据，或者查询所有数据，


    //h还有update根据id或者其他的字段来更新数据
    @Test
    public void testUserMapper() {
//       User user1 = userMapper.selectById(4);
//
//        System.out.println(user1);

//        User user = new User();
//        user.setUserName("mybatisplus");
//        user.setUserPassword("mybatisplus222");
//        userMapper.insert(user);


        //int i = userMapper.deleteById(13);
//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//
//        userQueryWrapper.eq("user_name", "123");
//        User user = userMapper.selectOne(userQueryWrapper);
//        System.out.println(user);
        //  userMapper.selectList(new );







//这里要注意的是： 必须要设置.eq()设置id值，明确是update哪条数据，不加这个条件就会所有数据全部更新，这个一定要注意。
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();

        userUpdateWrapper.set("user_name", "011111MyabtisUdateWrapper修改的后的值");
        userUpdateWrapper.eq("user_id",3);
        User user = new User();

        int update = userMapper.update(user, userUpdateWrapper);


        //查询所有的数据

//        List<User> list = userMapper.selectList(null);
//        System.out.println(list);

    }

//测试插入数据
    @Test
    public void testInsert(){

        User user = new User();
        user.setUserName("mwwwwws");
        user.setUserPassword("xxxxxxxx");
        userMapper.insert(user);



    }


    //测试删除一条数据
    @Test
    public void testDelete(){

       // int i = userMapper.deleteById(2);


        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_id",4);

        int delete = userMapper.delete(userQueryWrapper);

        System.out.println(delete);



        //下面这个UpdateWrapper不能用于根据id删除数据
//        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
//        UpdateWrapper<User> user_id = userUpdateWrapper.eq("user_id", "7");
//        System.out.println(user_id);


    }




}
