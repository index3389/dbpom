/**
 * @Title: UserController.java
 * @Package com.hqit.jd.controller
 * Copyright: Copyright (c) 2011 
 * @author ly
 * @date Jan 28, 2015 3:27:30 PM
 * @version V1.0
 */

package com.hqit.jd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqit.jd.domain.User;
import com.hqit.jd.repository.UserRepository;

/**
 * @ClassName: UserController
 * @author ly
 * @date Jan 28, 2015 3:27:30 PM
 */
@Controller
public class UserController 
{
    @ResponseBody
    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public Object list()
    {
    	Sort sort = new Sort(Direction.DESC, "updateAt");
    	Pageable page = new PageRequest(0, 10, sort);
    	
    	Page<User> list = userRepository.findAll(page);
    	
    	Map<String, Object> result = new HashMap<>();
    	result.put("total", list.getTotalElements());
    	result.put("data", list.getContent());
    	
		return result;
    }
    
    @ResponseBody
    @RequestMapping(value = "/user/show/{id}", method = RequestMethod.GET)
    public Object show(@PathVariable Integer id)
    {
		return userRepository.findOne(id);
    }
    
	@Autowired
	private UserRepository userRepository;
}
