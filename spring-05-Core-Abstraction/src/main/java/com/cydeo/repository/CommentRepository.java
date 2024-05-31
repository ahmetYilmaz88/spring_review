package com.practice.repository;

import com.practice.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
