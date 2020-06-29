package br.com.arekushi.mathio.model;

import java.io.Serializable;

public class Matter implements Serializable {
    private String name;
    private int imageId;
    private String text;

    public Matter(String name, int imageId, String text) {
        this.name = name;
        this.imageId = imageId;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setText(String text) {
        this.text = text;
    }
}
