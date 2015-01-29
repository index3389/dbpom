/**
 * @Title: UserRepository.java
 * @Package com.hqit.jd.repository
 * Copyright: Copyright (c) 2011 
 * @author ly
 * @date Jan 28, 2015 3:30:14 PM
 * @version V1.0
 */

package com.hqit.jd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqit.jd.domain.User;

/**
 * @ClassName: UserRepository
 * @author ly
 * @date Jan 28, 2015 3:30:14 PM
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	//public User findById(Integer uid);
}
