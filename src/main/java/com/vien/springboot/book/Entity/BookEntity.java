package com.vien.springboot.book.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Book", schema = "dbo", catalog = "BookWebsite")
public class BookEntity {
    private int id;
    private String title;
    private String bookCover;
    private String bookContent;
    private String describe;
    private String author;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "book_cover")
    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    @Basic
    @Column(name = "book_content")
    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    @Basic
    @Column(name = "describe")
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (bookCover != null ? !bookCover.equals(that.bookCover) : that.bookCover != null) return false;
        if (bookContent != null ? !bookContent.equals(that.bookContent) : that.bookContent != null) return false;
        if (describe != null ? !describe.equals(that.describe) : that.describe != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (bookCover != null ? bookCover.hashCode() : 0);
        result = 31 * result + (bookContent != null ? bookContent.hashCode() : 0);
        result = 31 * result + (describe != null ? describe.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", bookCover='" + bookCover + '\'' +
                ", bookContent='" + bookContent + '\'' +
                ", describe='" + describe + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
