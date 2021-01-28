package com.controller.demo.service.imp;

import java.util.List;

import com.controller.demo.dao.UsernameDao;
import com.controller.demo.dao.imp.UsernameDaoJdbcImp;
import com.controller.demo.domain.Username;
import com.controller.demo.service.UsernameService;

public class UsernameServiceImp implements UsernameService{
	UsernameDao usernamedao=new UsernameDaoJdbcImp();
	@Override
	public boolean checkUsername(String username) {
		List<Username> list=usernamedao.findByUsername(username);
		if (list.size()==1) {
		return true;	
		}
		return false;
	}

}
