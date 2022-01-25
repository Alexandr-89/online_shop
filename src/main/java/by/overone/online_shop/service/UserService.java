package by.overone.online_shop.service;

import by.overone.online_shop.dto.*;
import by.overone.online_shop.validator.exception.ValidatorException;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();
//    List<UserDTO> getAllActiveUsers(String status);
    void addUser(UserRegistretionDTO userRegistretionDTO) throws ValidatorException;
//    UserDTO getUserById(long id);
//    UserDetailDTO getUserDetailById(long users_id);
//    UserAllDetailsDTO getUserAllDetailsById(long id);
//    UserDTO getUserByLogin(String login);
//    UserDTO getUserByEmail(String email);
//    void deleteUser(long id);
//    void userUpdate(UserUpdateDTO userUpdateDTO);
//    void userDetailUpdate(UserDetailUpdateDTO userDetailUpdateDTO);

}
