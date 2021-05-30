package com.example.blog.service;

import com.example.blog.models.Post;
import com.example.blog.repo.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final PostRepository postRepository;

    public void blogPostAdd(String title, String anons, String fullText) {
        var post = new Post();
        post.setTitle(title);
        post.setAnons(anons);
        post.setFullText(fullText);
        postRepository.save(post);
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

}
