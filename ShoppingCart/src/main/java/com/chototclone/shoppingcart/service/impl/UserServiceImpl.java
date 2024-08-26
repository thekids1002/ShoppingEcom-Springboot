package com.chototclone.shoppingcart.service.impl;

import com.chototclone.shoppingcart.model.UserDtls;
import com.chototclone.shoppingcart.repository.UserRepository;
import com.chototclone.shoppingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDtls saveUser(UserDtls user) {
        user.setRole("ROLE_USER");
        user.setEnable(true);
        user.setAccountNonLocked(true);
        user.setFailedAttempt(0);

        String encodePassword = user.getPassword();
        user.setPassword(encodePassword);
        UserDtls saveUser = userRepository.save(user);
        return saveUser;
    }

    @Override
    public UserDtls getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDtls> getUsers(String role) {
        return List.of();
    }

    @Override
    public Boolean updateAccountStatus(Integer id, Boolean status) {
        return null;
    }

    @Override
    public void increaseFailedAttempt(UserDtls user) {

    }

    @Override
    public void userAccountLock(UserDtls user) {

    }

    @Override
    public boolean unlockAccountTimeExpired(UserDtls user) {
        return false;
    }

    @Override
    public void resetAttempt(int userId) {

    }

    @Override
    public void updateUserResetToken(String email, String resetToken) {

    }

    @Override
    public UserDtls getUserByToken(String token) {
        return null;
    }

    @Override
    public UserDtls updateUser(UserDtls user) {
        return null;
    }

    @Override
    public UserDtls updateUserProfile(UserDtls user, MultipartFile img) {
        return null;
    }

    @Override
    public UserDtls saveAdmin(UserDtls user) {
        return null;
    }

    @Override
    public boolean existsEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
