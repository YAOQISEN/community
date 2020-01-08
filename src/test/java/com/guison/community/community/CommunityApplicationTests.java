package com.guison.community.community;

import com.guison.community.community.cache.HotTagCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;


@SpringBootTest
class CommunityApplicationTests {

	@Autowired
	HotTagCache hotTagCache;

	@Test
	void getUser(){
	}

	@Test
	void contextLoads() {
	}

	@Test
	void getPriorityQueue(){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Java4",10);
		map.put("Java3",20);
		map.put("Java2",30);
		map.put("Java1",40);
		System.out.println(map);
		//hotTagCache.updateTags(map);

	}

}
