package com.shredding.articles;

import com.shredding.user.User;

import java.util.ArrayList;

public class Article {
    public User author;
    public String Topic;
    public String Content;
    public ArrayList<Comment> Comments;

    public Article(User author, String topic,String content){
        this.author = author;
        this.Topic = topic;
        this.Content = content;
    }

    public void comment(User user,String content){
        Comment newComment = new Comment(user,content,this);
        Comments.add(newComment);
    }
}
