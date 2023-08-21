package com.wayne.springsecuritydemo.serviceImpl;

import com.wayne.springsecuritydemo.dao.NoteBookRepository;
import com.wayne.springsecuritydemo.service.NoteBookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class NoteBookServiceImpl implements NoteBookService {
    @Resource
    NoteBookRepository noteBookRepository;

}
