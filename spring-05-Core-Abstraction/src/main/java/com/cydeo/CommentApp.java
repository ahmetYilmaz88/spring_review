package com.practice;

import com.practice.config.CommentConfig;
import com.practice.model.Comment;
import com.practice.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CommentConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Mike");
        comment.setText("Spring Framework");

        CommentService commentService = container.getBean(CommentService.class);

        commentService.publishComment(comment);

    }
}
