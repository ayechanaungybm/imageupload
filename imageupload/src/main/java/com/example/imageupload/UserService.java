package com.example.imageupload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
@Autowired UserRepository repo;
public void save(User user) {

	repo.save(user);
}
public List<User> getAllUsers()
{
List<User> list = (List<User>) repo.findAll();
return list;
}

}
