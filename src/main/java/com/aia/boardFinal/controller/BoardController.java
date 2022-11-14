package com.aia.boardFinal.controller;

import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/board/")
public class BoardController {
    @ResponseBody
    @RequestMapping("selectAll")
    public Map<String, Object> selectAll(){
        Map<String, Object> map = new HashMap<>();



        return map;
    }
}
