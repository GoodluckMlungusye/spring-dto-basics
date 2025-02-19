package com.goodamcodes.mapper;

import com.goodamcodes.dto.UserLocationDTO;
import com.goodamcodes.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserLocationDTO mapToUserLocationDTO(User user) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());

        if (user.getLocation() != null) {
            userLocationDTO.setPlace(user.getLocation().getPlace());
            userLocationDTO.setLatitude(user.getLocation().getLatitude());
            userLocationDTO.setLongitude(user.getLocation().getLongitude());
        }

        return userLocationDTO;
    }
}
