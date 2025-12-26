package com.doctor.app.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rating_id;
    @ManyToOne
    @JoinColumn(name = "doctorId",nullable = false)
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;
    @Min(1)
    @Max(5)
    private int review;
    private String comments;
    private String visited_date;

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getVvisited_date() {
        return visited_date;
    }

    public void setVvisited_date(String vvisited_date) {
        visited_date = vvisited_date;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating_id=" + rating_id +
                ", doctor=" + doctor +
                ", user=" + user +
                ", review=" + review +
                ", comments='" + comments + '\'' +
                ", Vvisited_date='" + visited_date + '\'' +
                '}';
    }
}
