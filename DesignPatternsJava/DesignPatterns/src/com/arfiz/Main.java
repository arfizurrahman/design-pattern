package com.arfiz;

import com.arfiz.adapter.CaramelFilter;
import com.arfiz.adapter.Image;
import com.arfiz.adapter.ImageView;
import com.arfiz.adapter.VividFilter;
import com.arfiz.adapter.avaFilters.Caramel;
import com.arfiz.composite.Group;
import com.arfiz.composite.Shape;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
