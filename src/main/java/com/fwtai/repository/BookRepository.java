package com.fwtai.repository;

import com.fwtai.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<实体类,该实体类的主键类型>
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020/5/24 23:02
 * @QQ号码 444141300
 * @Email service@yinlz.com
 * @官网 <url>http://www.yinlz.com</url>
*/
public interface BookRepository extends JpaRepository<Book,Integer>{

}