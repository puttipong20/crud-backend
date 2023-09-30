package com.test.testCRUD.repository;

import com.test.testCRUD.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
