package com.practice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.practice.proxy","com.practice.service","com.practice.repository"})
public class CommentConfig {
}
