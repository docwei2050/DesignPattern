package com.docwei.relearn.prototype;

public
/**
 * Created by liwk on 2022/7/23.
 */
class Test {
    public static void main(String[] args) {
        WordDoc doc = new WordDoc();
        doc.setText("a");
        doc.addImages("http://url1");
        doc.addImages("http://url2");
        doc.show();
        WordDoc doc2 = doc.clone();
        doc2.show();
        doc2.setText("bbb");
        doc2.addImages("http://url3");
        doc2.show();
        doc.show();
    }
}
