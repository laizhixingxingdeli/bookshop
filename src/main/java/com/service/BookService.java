package com.service;

import com.bean.Book;
import com.bean.Page;

import java.util.List;

public interface BookService {
    public List<Book> queryBookByRecommendType(int rtype, int pageNumber, int pageSize);
    public Page queryBookByRecommendType(int rtype, int pageNumber);
    public Book queryBookByID(int bid);
    public Page searchBooksByKeyword(String keyword, int pageNumber);
    public boolean addRecommend(int bid,int rtype);
    public boolean remoteRecommend(int bid,int rtype);
    public boolean removeBookByBid(int bid);
    public boolean addBook(Book book);
    public boolean modifyBook(Book book);
}
