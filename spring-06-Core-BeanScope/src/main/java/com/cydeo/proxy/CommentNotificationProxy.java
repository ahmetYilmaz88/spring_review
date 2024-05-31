package com.practice.proxy;

import com.practice.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
