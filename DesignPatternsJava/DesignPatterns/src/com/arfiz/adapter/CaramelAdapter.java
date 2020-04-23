package com.arfiz.adapter;

import com.arfiz.adapter.avaFilters.Caramel;

// Composition is preferable over inheritance...
public class CaramelAdapter extends Caramel implements Filter{
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
