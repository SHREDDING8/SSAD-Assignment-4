package com.shredding.articles;

import com.shredding.user.User;

public class Comment{
    public User author;
    public String Content;
    public Article article;

    public Comment(User author,String content,Article article){
        this.author = author;
        this.Content = content;
        this.article=article;
    }
}
