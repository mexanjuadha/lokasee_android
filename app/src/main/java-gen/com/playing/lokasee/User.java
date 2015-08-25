package com.playing.lokasee;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER.
 */
public class User {

    private Long id;
    private String object_id;
    private String facebook_id;
    private String name;
    private Double latitude;
    private Double longitude;
    private String url_prof_pic;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String object_id, String facebook_id, String name, Double latitude, Double longitude, String url_prof_pic) {
        this.id = id;
        this.object_id = object_id;
        this.facebook_id = facebook_id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.url_prof_pic = url_prof_pic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getUrl_prof_pic() {
        return url_prof_pic;
    }

    public void setUrl_prof_pic(String url_prof_pic) {
        this.url_prof_pic = url_prof_pic;
    }

}
