package com.docwei.relearn.prototype;


import java.util.ArrayList;

public class WordDoc implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDoc() {
        System.out.println("构造函数");
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImages(String url) {
        mImages.add(url);
    }

    public void show() {
        System.out.println("--------------" + this + "------------");
        System.out.println("text-->" + mText);
        for (String img : mImages) {
            System.out.println(img);
        }
    }

    @Override
    protected WordDoc clone() {
        try {
            // 如果WordDoc的成员全部是基本类型，那可以直接浅拷贝就可以
            // 如果存在引用类型，则需要深拷贝
            WordDoc doc = (WordDoc) super.clone();

            //这里的ArrayList就是深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
