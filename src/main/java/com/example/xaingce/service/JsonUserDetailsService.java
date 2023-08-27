package com.example.xaingce.service;

import com.example.xaingce.pojo.JsonUser;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface JsonUserDetailsService {
    public List<JsonUser> loadUserByUsername();
}
