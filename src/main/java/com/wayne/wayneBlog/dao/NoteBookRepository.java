package com.wayne.wayneBlog.dao;

import com.wayne.wayneBlog.entity.NoteBookBean;
import com.wayne.wayneBlog.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository(value = "noteRepository")
public interface NoteBookRepository extends JpaRepository<NoteBookBean, Integer> {

    @Query(value = "from NoteBookBean where title = ?1")
    UserBean findByTitle(String title);
}
