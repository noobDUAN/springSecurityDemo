package com.wayne.springsecuritydemo.controller;

import com.wayne.springsecuritydemo.dao.NoteBookRepository;
import com.wayne.springsecuritydemo.entity.NoteBookBean;
import com.wayne.springsecuritydemo.service.NoteBookService;
import jakarta.annotation.Resource;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/NoteBook")
public class NoteBookController {

    @Resource
    NoteBookService noteBookService;
    @Resource
    NoteBookRepository noteBookRepository;

    @RequestMapping({"/"})
    public String index() {
        return "tiny/tiny";
    }

    @PostMapping({"/save"})
    @ResponseBody
    public Response save(NoteBookBean noteBookBean) {
        noteBookBean.setCreate_time(new Date());
        noteBookBean.setUpdate_time(new Date());
        noteBookRepository.save(noteBookBean);
        return new Response();
    }
}
