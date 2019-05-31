package com.trajectoryvisualizer.service;

import com.trajectoryvisualizer.dao.TrajectoryDao;
import com.trajectoryvisualizer.entity.RawStudies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrajectoryService {
    @Autowired
    TrajectoryDao trajectoryDao;

    public List<RawStudies> getAllTrajectories() {
        return this.trajectoryDao.findAll();
    }

//    public Trajectory addUser(Trajectory user) {
//        return this.userDao.save(user);
//    }

    //other methods omitted for brevity
}
