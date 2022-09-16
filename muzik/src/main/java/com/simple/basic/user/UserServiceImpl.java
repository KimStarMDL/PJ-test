package com.simple.basic.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.basic.command.RecodeDTO;
import com.simple.basic.command.UploadDTO;
import com.simple.basic.command.UserDTO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public boolean userInsert(UserDTO dto) {
		return userMapper.userInsert(dto);
	}

	@Override
	public int idCheck(String u_id) {
		return userMapper.idCheck(u_id);
	}

	@Override
	public int nickCheck(String u_nick) {
		return userMapper.nickCheck(u_nick);
	}

	@Override
	public UserDTO login(UserDTO user) {
		return userMapper.login(user);
	}

	@Override
	public List<RecodeDTO> myRecode1(String u_id) {
		return userMapper.myRecode1(u_id);
	}

	@Override
	public List<UploadDTO> myRecode2() {
		return userMapper.myRecode2();
	}
}
