package com.sda.car_rental.Mapper;


import com.sda.car_rental.Model.Dto.UserDTO;
import com.sda.car_rental.Model.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper {
    public static List<UserDTO> mapUserToUserDto(List<User> users) {
        return users.stream()
                .map(user -> new UserDTO(user.getId(), user.getEmail()
                        , user.getPassword())).collect(Collectors.toList());
    }


}
