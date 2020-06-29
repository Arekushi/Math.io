package br.com.arekushi.mathio.model;

import android.media.Image;

public class Matter {
    private String name;
    private Image image;
    private String text;

    public Matter(String name, Image image, String text) {
        this.name = name;
        this.image = image;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }
}
