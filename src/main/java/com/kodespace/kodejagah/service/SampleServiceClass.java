package com.kodespace.kodejagah.service;


import com.kodespace.kodejagah.Exceptions.UserNotFoundException;
import com.kodespace.kodejagah.constants.UserConstants;
import com.kodespace.kodejagah.entity.User;
import com.kodespace.kodejagah.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class SampleServiceClass {



    private final UserRepository userRepository;

    public String getUserNameById(Integer userId) throws UserNotFoundException {

        User userObj = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(MessageFormat.format(UserConstants.USER_NOT_FOUND, userId)));
        return userObj.getName();



    }
}
