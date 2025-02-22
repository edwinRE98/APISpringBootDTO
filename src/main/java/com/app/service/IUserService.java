package com.app.service;

import com.app.dto.UserDTO;
import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
    UserDTO findById(Long id);
    UserDTO save(UserDTO userDTO);
    UserDTO update(UserDTO userDTO, Long id);
    String delete(Long id);
}