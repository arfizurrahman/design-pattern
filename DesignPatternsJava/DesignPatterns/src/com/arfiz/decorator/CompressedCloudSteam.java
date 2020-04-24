package com.arfiz.decorator;

public class CompressedCloudSteam implements Stream{
    private Stream stream;

    public CompressedCloudSteam(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(data);
    }

    public String compress (String data) {
        return data.substring(0, 5);
    }
}
