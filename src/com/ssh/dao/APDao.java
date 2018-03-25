package com.ssh.dao;

import java.util.List;

import com.ssh.entity.AP;

public interface APDao {

	AP search(AP ap);

	List<AP> searchAll();

	void add(AP ap);


}
