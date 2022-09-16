package com.simple.basic.user;


import java.util.List;

import com.simple.basic.command.RecodeDTO;
import com.simple.basic.command.UploadDTO;
import com.simple.basic.command.UserDTO;

public interface UserService {
	public boolean userInsert(UserDTO dto); //회원가입
	public int idCheck(String u_id); // id 중복체크
	public int nickCheck(String u_nick); // 닉네임 중복체크
	public UserDTO login(UserDTO user); // 로그인
	public List<RecodeDTO> myRecode1(String u_id); // 내 음악 가져오기
	public List<UploadDTO> myRecode2(); // 내 음악 가져오기
}
