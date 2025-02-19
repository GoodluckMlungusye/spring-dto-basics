//package com.goodamcodes.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//public class UserLocationDTO {
//    private Long userId;
//    private String email;
//    private String place;
//    private double latitude;
//    private double longitude;
//}


package com.goodamcodes.dto;

public class UserLocationDTO {
    private Long userId;
    private String email;
    private String place;
    private double latitude;
    private double longitude;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

