package com.maya.useraccess.model;

import java.sql.Timestamp;

public class UserModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.id
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.user_name
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.birthday
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    private Timestamp birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.description
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.id
     *
     * @return the value of public.user.id
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.id
     *
     * @param id the value for public.user.id
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.user_name
     *
     * @return the value of public.user.user_name
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.user_name
     *
     * @param username the value for public.user.user_name
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.birthday
     *
     * @return the value of public.user.birthday
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public Timestamp getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.birthday
     *
     * @param birthday the value for public.user.birthday
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.description
     *
     * @return the value of public.user.description
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.description
     *
     * @param description the value for public.user.description
     *
     * @mbggenerated Tue Apr 16 02:09:01 CDT 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}