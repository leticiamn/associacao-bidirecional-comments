package com.example.comment.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @OneToMany(mappedBy = "id")
    private List<PostComment> comments = new ArrayList<PostComment>();

    public Post() {
    }

    public Post(Integer id, String title, List<PostComment> comments) {
        this.id = id;
        this.title = title;
        this.comments = comments;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PostComment> getComments() {
        return this.comments;
    }

    public void setComments(List<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", title='" + getTitle() + "'" +
                ", comments='" + getComments() + "'" +
                "}";
    }

    public void addComment(PostComment postComment) {
        Post post = new Post(this.id, this.title, this.comments);
        postComment.setPost(post);
        String review = "";
        postComment.setReview(review);
        comments.add(postComment);
    }

    public void removeComment(PostComment postComment) {
        comments.remove(postComment);
    }
}
