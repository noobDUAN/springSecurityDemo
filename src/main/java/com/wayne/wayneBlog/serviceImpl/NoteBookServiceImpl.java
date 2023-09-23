package com.wayne.wayneBlog.serviceImpl;

import com.wayne.wayneBlog.dao.NoteBookRepository;
import com.wayne.wayneBlog.service.NoteBookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class NoteBookServiceImpl implements NoteBookService {
    @Resource
    NoteBookRepository noteBookRepository;

}
