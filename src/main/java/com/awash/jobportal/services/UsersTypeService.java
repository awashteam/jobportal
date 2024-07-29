package com.awash.jobportal.services;

import com.awash.jobportal.entity.UsersType;
import com.awash.jobportal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAllUsersTypes() {
        return usersTypeRepository.findAll();
    }
}
