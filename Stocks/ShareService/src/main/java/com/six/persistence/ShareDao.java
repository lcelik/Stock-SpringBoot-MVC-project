package com.six.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.six.entity.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer> {

	
}
