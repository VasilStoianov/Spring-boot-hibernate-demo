package com.example.hibdemo2.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  UserRepository userRepository;
  BookRepository bookRepository;
  @Value("#{2 > 1 ? 'a' : 'b'}")
  private String property;

  @Autowired
  public UserService(UserRepository userRepository,BookRepository bookRepository){
    this.bookRepository = bookRepository;
    this.userRepository = userRepository;
  }

  List<User> getAllUsers(){

    List users = new ArrayList<User>();
     userRepository.findAll().forEach(e -> users.add(e));
    System.out.println(property);
     return users;
  }

  String saveUser(User user){
    userRepository.save(user);
    return "Saved";
  }

  String updateUser(User user){
    userRepository.save(user);
    return "Updated";

  };

  String deleteUser(User user){
    userRepository.delete(user);
    return "Deleted";
  }

  public String saveBook(Book book) {
    bookRepository.save(book);
    return "book saved";
  }

  public List<Book> getAllBooks(){

    List books = new ArrayList() ;
        bookRepository.findAll().forEach(e -> books.add(e));
        return books;
  }
}
