package com.example.hibdemo2.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UsersController {

  @Autowired
  UserService userService;

  @GetMapping("/users")
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @PostMapping("/user")
  public String saveUser(@RequestBody User user){
    user.setRegDate(new Date());
   return userService.saveUser(user);
  }

  @PutMapping("/user")
  public String updateUser(@RequestBody User user){
    return userService.updateUser(user);
  }

  @DeleteMapping("/user")
  public String deleteUser(@RequestBody User user){
    return userService.deleteUser(user);
  }

  @PostMapping("/book")
  public String addBook(@RequestBody Book book){
    return userService.saveBook(book);
  }

  @GetMapping("/books")
  public List<Book> getAllBook(){
    return userService.getAllBooks();
  }
}
