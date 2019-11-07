package com.dxy.artemis.totti.service;

import com.dxy.artemis.totti.dao.mapper.JobMapper;
import com.dxy.artemis.totti.dao.pojo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    JobMapper jobMapper;

    public Job findById(Long id) {
        return jobMapper.selectByPrimaryKey(id);
    }
}
