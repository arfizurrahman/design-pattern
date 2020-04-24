package com.arfiz;

import com.arfiz.adapter.CaramelFilter;
import com.arfiz.adapter.Image;
import com.arfiz.adapter.ImageView;
import com.arfiz.adapter.VividFilter;
import com.arfiz.adapter.avaFilters.Caramel;
import com.arfiz.composite.Group;
import com.arfiz.composite.Shape;
import com.arfiz.decorator.CloudStream;
import com.arfiz.decorator.CompressedCloudSteam;
import com.arfiz.decorator.EncryptedCloudStream;
import com.arfiz.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudSteam(new CloudStream())));
    }


    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
