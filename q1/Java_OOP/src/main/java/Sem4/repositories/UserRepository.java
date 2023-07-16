package Sem4.repositories;

import Sem4.models.User;

import java.util.List;

public interface UserRepository <T extends User>{

    void create(T user);
    List<T> getAll();
    int remove(String fullName);
}
