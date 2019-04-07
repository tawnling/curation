package io.github.tawn0000.curation.entity;

import java.util.Date;

public class Comment {
    //自增评论编号
    private Long  id;
    //用户编号
    private Long uid;
    //展览编号
    private Long eid;
    //展品编号
    private Long e1id;
    //评论时间
    private Date date;
    //评论文字内容
    private String content;
    //评论图片
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Long getE1id() {
        return e1id;
    }

    public void setE1id(Long e1id) {
        this.e1id = e1id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}