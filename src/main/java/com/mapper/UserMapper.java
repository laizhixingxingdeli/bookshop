package com.mapper;

import com.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    public void addUser(User user);
    public int identify(String uname);
    public void UpdatePhoneAndAddress(int uid,String uphone,String uaddress);
    public void UpdatePassword(int uid,String upwd);
    public int getUidByUname(String uname);
    public User login(String uname );
    public String queryUpwd(int uid);
    public List<User> queryUser(int pageIndex, int pageSize);
    public int queryCountOfUser();
    public void deleteUser(int uid);
    public User queryUserByUid(int uid);
}
