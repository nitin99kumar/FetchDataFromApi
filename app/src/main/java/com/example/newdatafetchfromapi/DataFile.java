package com.example.newdatafetchfromapi;

public class DataFile {

    private String title;
    private String description;
//    private String urlToImage;

    public DataFile(String title, String description /*String urlToImage*/){
        this.title = title;
        this.description = description;
//        this.urlToImage = urlToImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

//    public String getUrlToImage() {
//        return urlToImage;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void setUrlToImage(String urlToImage) {
//        this.urlToImage = urlToImage;
//    }

}
