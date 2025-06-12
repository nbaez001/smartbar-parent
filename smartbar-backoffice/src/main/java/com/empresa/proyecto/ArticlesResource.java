package com.empresa.proyecto;

import com.empresa.proyecto.api.ArticlesApi;
import com.empresa.proyecto.model.Article;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

public class ArticlesResource implements ArticlesApi {

    private final Article article = new Article().name("Chardonnay");

    @Override
    public Response articlesArticleIdDelete(String articleId) {
        return Response.ok().build();
    }

    @Override
    public Response articlesArticleIdGet(String articleId) {
        return Response.ok(article).build();
    }

    @Override
    public Response articlesArticleIdPut(String articleId, Article article) {
        return Response.ok().build();
    }

    @Override
    public Response articlesGet() {
        return Response.ok(List.of(article)).build();
    }

    @Override
    public Response articlesPost(Article article) {
        return Response.created(URI.create("todo")).build();
    }
}
