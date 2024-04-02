package com.example.mavenmodle1.mapper;

import com.example.mavenmodle1.bookList.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface BookMapper {
    @Insert("insert into books (bookType,bookName,detail) VALUES (#{bookType},#{bookName},#{detail})")
    void addBook(Book book);
    @Select("select * from books where bookName LIKE CONCAT('%', #{bookName} , '%')")
    List<Book> selectBookByName(String bookName);
    @Select("select * from books where bookID = #{bookID}")
    Book selectBookByID(int bookID);
    @Select("select * from books")
    List<Book> selectAllBook();
    @Delete("delete from books where bookID=#{bookID}")
    void deleteBookByID(int bookID);
    @Update("update books" +
            " SET bookName = #{bookName},bookType = #{bookType},bookName = #{bookName},detail = #{detail}\n" +
            " where bookID = #{bookID}")
    void updateBook(Book book);
}
