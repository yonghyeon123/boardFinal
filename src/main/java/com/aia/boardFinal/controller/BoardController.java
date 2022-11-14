package com.aia.boardFinal.controller;

import com.aia.boardFinal.service.BoardService;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/board/")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @ResponseBody
    @RequestMapping("selectAll")
    public Map<String, Object> selectAll(){
        Map<String, Object> map = new HashMap<>();

        List list = boardService.selectAll();
        map.put("message", "success");
        map.put("data", list);

        System.out.println(list);

        return map;
    }
}
