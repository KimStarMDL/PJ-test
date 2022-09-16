package com.simple.basic.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	CommunityMapper communityMapper;
}
