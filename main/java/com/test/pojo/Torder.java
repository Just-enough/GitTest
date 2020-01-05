package com.test.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Torder {
    private Integer id;

    private Integer uid;

    private Integer num;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    private String note;

    private String pic;

    public Torder(Integer id, Integer uid, Integer num, Date createTime, String note, String pic) {
        this.id = id;
        this.uid = uid;
        this.num = num;
        this.createTime = createTime;
        this.note = note;
        this.pic = pic;
    }

    public Torder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}