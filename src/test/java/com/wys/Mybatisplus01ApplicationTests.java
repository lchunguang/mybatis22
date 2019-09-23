package com.wys;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wys.mapper.PermissionMapper;
import com.wys.mapper.RoleMapper;
import com.wys.mapper.UserMapper;
import com.wys.model.Permission;
import com.wys.model.Role;
import com.wys.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatisplus01ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    PermissionMapper permissionMapper;
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
        userUpdateWrapper.eq("user_id", 3);
        User user = new User();

        int update = userMapper.update(user, userUpdateWrapper);


        //查询所有的数据

//        List<User> list = userMapper.selectList(null);
//        System.out.println(list);

    }

    //测试插入数据
    @Test
    public void testInsert() {

        User user = new User();
        user.setUserName("mwwwwws");
        user.setUserPassword("xxxxxxxx");
        userMapper.insert(user);


    }


    //测试删除一条数据
    @Test
    public void testDelete() {

        // int i = userMapper.deleteById(2);


        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_id", 4);

        int delete = userMapper.delete(userQueryWrapper);

        System.out.println(delete);


        //下面这个UpdateWrapper不能用于根据id删除数据
//        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
//        UpdateWrapper<User> user_id = userUpdateWrapper.eq("user_id", "7");
//        System.out.println(user_id);


    }

    @Test
    public void testBooleanfunction() {

//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//
//        List<User> users = userMapper.selectList(userQueryWrapper);
//
//        for(User user:users){
//            System.out.println(user);
//        }

//
//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
//
//        QueryWrapper<User> in = userQueryWrapper.notIn(true
//                , "user_name", "mwwwwws");

//        List<User> users = userMapper.selectList(in);
//
//        for(User user:users){
//
//            System.out.println(user);
//
//        }

//        Integer integer = userMapper.selectCount(userQueryWrapper);
//        System.out.println(integer);

        //????????????????????????????????????????????????????????????????????????????????????
        //测试selectByMap方法????/  vuserMapper.selectByMap(查询多条数据都有问题？？？？？？？？？？？？
        //????????????????????????????????????????????????????????????????????????????????????

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
        //
        //这里一定要注意的是。0r()隔开不同的查询条件，说明这是查询两个不同的字，返回的是两条数据，
        //若果直接都是.eq.eq() 这其实就是查询一条数据，表明的查询的这条数据同时满足.eq().eq(）这几个条件。
        userQueryWrapper.eq("user_name", "ad").or().eq("user_password","5555");

        List<User> users = userMapper.selectList(userQueryWrapper);
        System.out.println(users);


//        Map map1 = new HashMap<String, Object>();
//        map1.put("user_name", "ad");
////        map1.put("user_name", "mwwwwws");
//        map1.put("user_password","5555");
//        List list = userMapper.selectByMap(map1);
//        System.out.println(list);

//????????????????????????????????????????????????????????????????????????????????????
  //      QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
        // userQueryWrapper.eq("user_name", "mwwwwws");
        // userQueryWrapper.eq("user_password","5555") ;
   //     Map<String, Object> map2 = new HashMap<String, Object>();
  //      map2.put("user_name", "mwwwwws");
  //      map2.put("user_password","5555");
        //userQueryWrapper.allEq(map2);
   //     List<User> userList = userMapper.selectByMap(map2);
//
  //      System.out.println(userList);

//????????????????????????????????????????????????????????????????????????????????????

//删除几个id对应的数据
//        List<Integer> idList = new ArrayList<Integer>();
//        idList.add(5);
//        idList.add(6);
//
//        int i = userMapper.deleteBatchIds(idList);
//        System.out.println(i);


    }

//x下面这个方法，map放两个条件，为什么就查询不出来多条数据呢？put只放一个就可以查询出来单条数据。、、//
    //xia下面测试方式是错误的，找了半天也不知解决办法，先放着，可以用selectList来查询多条数据。
 //   @Test
//    public void  testSelectByMaps(){
////
//
//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();
//
//        Map<String, Object> columnMap = new HashMap<String, Object>();
//        columnMap.put("user_name" ,"mwwwwws");
//        columnMap.put("user_password","5555");
//      //  map.put();
//        List<User> users = userMapper.selectByMap(columnMap);
//        System.out.println(users);
//        System.out.println(users.size());
//
//    }


    @Test
    public void test01(){

//        User user = new User();
//        user.setUserName("1");
//
//        int i = userMapper.insert(user);
//
//        System.out.println(i);
//        System.out.println(user);

        User user = new User();
        user.setUserId(12);
        user.setUserPassword("123");
        user.setUserName("tt");

        userMapper.updateById(user);


    }



    @Test
    public void ftestRole(){

        Role role = roleMapper.selectById(2);

        System.out.println(role);

    }


    @Test
    public void ftestPermisiioin(){

       // Permission permission = permissionMapper.selectById(2);

        //System.out.println(permission);


        List<Role> roles = roleMapper.selectRolesBYRoleIdOrRoleName("普通员工", 2);

        System.out.println(roles);

    }

}
