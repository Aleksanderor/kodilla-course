package com.kodilla.testing.forum.statistics;

public class ForumComment {

    private String commentBody;
    private ForumPost forumPost;
    private String author;

    public ForumComment(ForumPost forumPost, String author, String commentBody) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getAuthor() {
        return author;
    }

    public String getCommentBody() {
        return commentBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!forumPost.equals(that.forumPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 2 * result + commentBody.hashCode();
        result = 2 * result + author.hashCode();
        return result;
    }
}
