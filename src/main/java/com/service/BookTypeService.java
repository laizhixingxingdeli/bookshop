package com.service;

import com.bean.BookType;
import com.bean.Page;

import java.util.List;

public interface BookTypeService {
    public List<BookType> queryBookTypes();
    public Page queryBookByBookTypeID(int btid, int pageNumber);
    public String queryBookTypeNameByBookTypeID(int btid);
    public boolean addBookType(String btname);
    public boolean removeBookType(int btid);
    public boolean modifyBookType(int btid,String btname);
}
