package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.loadDao;
import com.example.demo.entities.payLoad;

@Service
public class loadServiceImpl implements loadService {
	
	@Autowired
	private loadDao loaddao;

	@Override
	public String addLoad(payLoad load) {
		loaddao.save(load);
		return "loads details added successfully";
	}

	@Override
	public payLoad getLoad(long loadId) {
		return loaddao.findById(loadId).get();
	}

	@Override
	public List<payLoad> getLoads(String id) {
		ArrayList<payLoad> loads=(ArrayList<payLoad>) loaddao.findAll();
		ArrayList<payLoad> ans=new ArrayList<>();
		loads.forEach(o -> {
			if(o.getShipperId().equals(id)) {
				ans.add(o);
			}
		});
		return ans;
		//return loaddao.findAll().stream().filter(e -> e.getShipperId()==id).collect(Collectors.toList());
	}

	@Override
	public void updateLoad(payLoad load) {
		loaddao.save(load);
	}

	@Override
	public void deleteLoad(long loadId) {
		payLoad tmp=loaddao.getById(loadId);
		loaddao.delete(tmp);
	}
	
}