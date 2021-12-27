package by.overone.online_shop.controller;

import by.overone.online_shop.dao.UserDAO;
import by.overone.online_shop.dto.UserDTO;
import by.overone.online_shop.model.User;
import by.overone.online_shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final UserDAO userDAO;

    @GetMapping("/all")
    public List<UserDTO> readAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/byStatus")
    public List<UserDTO> getAllActiveUser(@RequestParam String status){
        return userService.getAllActiveUsers(status);
    }

    @GetMapping("/byId")
    public UserDTO getUserById(@RequestParam long id){
        return userService.getUserById(id);
    }

    @GetMapping("/byLogin")
    public UserDTO getUserByLogin(@RequestParam String login){
        return userService.getUserByLogin(login);
    }

    @GetMapping("/byEmail")
    public UserDTO getUserByEmail(@RequestParam String email){
        return userService.getUserByEmail(email);
    }


    @GetMapping("/hello")
    public String read() {
        return "hello";
    }

}