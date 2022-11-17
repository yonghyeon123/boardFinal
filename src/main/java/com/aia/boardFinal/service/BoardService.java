package com.aia.boardFinal.service;

import com.aia.boardFinal.model.BoardDTO;
import com.aia.boardFinal.model.UserDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class BoardService {
    @Autowired
    private SqlSession session;
    private final String NAMESPACE = "BoardMapper";

    public List<HashMap> selectAll(){
        return session.selectList(NAMESPACE + ".selectAll");
    }

    public void update(UserDTO userDTO){
        session.update(NAMESPACE + ".update", userDTO);
    }
}
