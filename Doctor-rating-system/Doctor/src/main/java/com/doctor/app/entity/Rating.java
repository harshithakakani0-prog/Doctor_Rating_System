package com.doctor.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rating_id;
    private int Doctor_Id;
    private int user_ID;
    private int review;
    private String comments;
    private String Vvisited_date;

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public int getDoctor_Id() {
        return Doctor_Id;
    }

    public void setDoctor_Id(int doctor_Id) {
        Doctor_Id = doctor_Id;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
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
        return Vvisited_date;
    }

    public void setVvisited_date(String vvisited_date) {
        Vvisited_date = vvisited_date;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating_id=" + rating_id +
                ", Doctor_Id=" + Doctor_Id +
                ", user_ID=" + user_ID +
                ", review=" + review +
                ", comments='" + comments + '\'' +
                ", Vvisited_date='" + Vvisited_date + '\'' +
                '}';
    }
}
