package com.example.hibdemo2.users;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book {


  @Id
  private int bookId;
  private int userId;
  private String bookName;
  private int pages;
}
