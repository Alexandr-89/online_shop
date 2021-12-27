package by.overone.online_shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    private String login;
    private String password;
    private String email;
    private Role role;
    private Status status;
//    private Role role;
//    private Status status;
}