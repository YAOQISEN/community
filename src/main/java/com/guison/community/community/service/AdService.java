package com.guison.community.community.service;

import com.guison.community.community.mapper.AdMapper;
import com.guison.community.community.model.Ad;
import com.guison.community.community.model.AdExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdService {
    @Autowired
    private AdMapper adMapper;

    public List<Ad> list(String pos){
        AdExample adExample = new AdExample();
        adExample.createCriteria()
                .andStatusEqualTo(1)
                .andPostionEqualTo(pos)
                .andGmtStartLessThan(System.currentTimeMillis())
                .andGmtEndGreaterThan(System.currentTimeMillis());
        return adMapper.selectByExample(adExample);
    }

}
