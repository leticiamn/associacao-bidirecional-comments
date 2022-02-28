package com.example.comment.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String review;
    @ManyToOne
    private Post post;

    public PostComment() {
    }

    public PostComment(Integer id, String review, Post post) {
        this.id = id;
        this.review = review;
        this.post = post;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", review='" + getReview() + "'" +
                ", post='" + getPost() + "'" +
                "}";
    }

}
