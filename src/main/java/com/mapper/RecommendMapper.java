package com.mapper;

import com.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RecommendMapper {
    public List<Book> queryBookByRecommendType(int rtype, int pageIndex, int pageSize); //按推荐类型查询图书
    public int queryRecommendCountOfBooksByTypeID(int rtype);//根据推荐类型查询总数
    public int queryBookByRtypeAndBid(int rtype,int bid);
    public void addRecommendBook(int bid,int rtype);//添加推荐书籍
    public void removeRecommendBook(int bid,int rtype);//删除推荐书籍
    public void removeRecommend(int bid);
}
