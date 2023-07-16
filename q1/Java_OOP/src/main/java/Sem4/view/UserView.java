package Sem4.view;

public interface UserView {
    void sendOnConsole();
    void sendOnConsole(String sortType);
    void create(String fullName, Integer age, String phoneNumber);
    void removeUser(String fullName);
}
