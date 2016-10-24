package com.example.azamat.testaltarix;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by azz on 06.09.16.
 */
public class GeoDataModel {


    private String title;
    private int dist;
    private String image;

    public GeoDataModel(){

    }

    public void setTitle(String title) {
     this.title = title;
   }

    public void setDist(int dist) {
       this.dist = dist;
   }

    public void setImage(String image) {
       this.image = image;
   }


    public String getTitle(){
        return title;
    }

    public Integer getDist(){
        return dist;
    }

    public String getImage(){
        return image;
    }


}
