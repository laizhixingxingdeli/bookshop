package com;

import com.bean.Book;
import com.bean.User;
import com.mapper.BookMapper;
import com.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FinallyApplicationTests {
    @Autowired
    public UserMapper userMapper;
    @Autowired
    public BookMapper bookMapper;
    @Test
    void contextLoads() {
        List<Book> books = bookMapper.queryBooks(0,2);
        for (Book book:books
             ) {
            System.out.println(book);
        }
    }
    @Test
    public void test01(){
        User user = userMapper.queryUserByUid(5);
        System.out.println(user);
    }

}
