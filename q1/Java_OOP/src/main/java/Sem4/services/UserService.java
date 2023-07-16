package Sem4.services;

import Sem4.models.User;

import java.util.List;

public interface UserService <T extends User>{

    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
    int remove(String fullName);

}
