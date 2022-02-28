package com.example.comment.Repository;

import com.example.comment.Model.PostComment;

import org.springframework.data.repository.CrudRepository;

public interface PostCommentRepository extends CrudRepository<PostComment, Integer> {

}
