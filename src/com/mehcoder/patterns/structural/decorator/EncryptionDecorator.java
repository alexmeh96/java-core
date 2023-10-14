package com.mehcoder.patterns.structural.decorator;

public class EncryptionDecorator implements DataSource {

    private DataSource dataSource;

    public EncryptionDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(dataSource.readData());
    }

    private String encode(String data) {
        System.out.println("encode: " + data);
        return data;
    }

    private String decode(String data) {
        System.out.println("decode: " + data);
        return data;
    }
}
