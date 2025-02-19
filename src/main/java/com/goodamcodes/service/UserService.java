//package com.goodamcodes.service;
//
//import com.goodamcodes.dto.UserLocationDTO;
//import com.goodamcodes.model.Location;
//import com.goodamcodes.model.Student;
//import com.goodamcodes.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<UserLocationDTO> getUserLocation() {
//        return userRepository.findAll()
//                .stream()
//                .map(this::convertToUserLocationDTO)
//                .collect(Collectors.toList());
//    }
//
//    public void createUser(UserLocationDTO userLocationDTO) {
//        Student student = convertToUser(userLocationDTO);
//        userRepository.save(student);
//    }
//
//    private UserLocationDTO convertToUserLocationDTO(Student student) {
//        UserLocationDTO userLocationDTO = new UserLocationDTO();
//        userLocationDTO.setUserId(student.getId());
//        userLocationDTO.setEmail(student.getEmail());
//
//        if (student.getLocation() != null) {
//            userLocationDTO.setPlace(student.getLocation().getPlace());
//            userLocationDTO.setLatitude(student.getLocation().getLatitude());
//            userLocationDTO.setLongitude(student.getLocation().getLongitude());
//        }
//
//        return userLocationDTO;
//    }
//
//    private Student convertToUser(UserLocationDTO userLocationDTO) {
//        Student student = new Student();
//        student.setId(userLocationDTO.getUserId());
//        student.setEmail(userLocationDTO.getEmail());
//
//        Location location = new Location();
//        location.setPlace(userLocationDTO.getPlace());
//        location.setLatitude(userLocationDTO.getLatitude());
//        location.setLongitude(userLocationDTO.getLongitude());
//
//        student.setLocation(location);
//        return student;
//    }
//
//}


package com.goodamcodes.service;

import com.goodamcodes.dto.UserLocationDTO;
import com.goodamcodes.repository.UserRepository;
import com.goodamcodes.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserLocationDTO> getUserLocation() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapToUserLocationDTO)
                .collect(Collectors.toList());
    }
}
