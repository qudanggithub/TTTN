package com.quocuy.application.service;

import com.quocuy.application.entity.Comment;
import com.quocuy.application.model.request.CreateCommentPostRequest;
import com.quocuy.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
