package de.schalanda.jadconfig.testbeans;

import de.schalanda.jadconfig.Parameter;
import de.schalanda.jadconfig.converters.StringListConverter;

import java.io.File;
import java.net.URI;
import java.util.List;

public class SimpleConfigurationBean {

    @Parameter("test.string")
    private String myString;

    @Parameter("test.byte")
    private byte myByte;

    @Parameter("test.short")
    private short myShort;

    @Parameter("test.integer")
    private int myInt;

    @Parameter("test.long")
    private long myLong;

    @Parameter("test.float")
    private float myFloat;

    @Parameter("test.double")
    private double myDouble;

    @Parameter("test.boolean")
    private boolean myBoolean;

    @Parameter(value = "test.list", converter = StringListConverter.class)
    private List<String> stringList;

    @Parameter("test.uri")
    private URI uri;

    @Parameter("test.file")
    private File file;

    public String getMyString() {
        return myString;
    }

    public byte getMyByte() {
        return myByte;
    }

    public short getMyShort() {
        return myShort;
    }

    public int getMyInt() {
        return myInt;
    }

    public long getMyLong() {
        return myLong;
    }

    public float getMyFloat() {
        return myFloat;
    }

    public double getMyDouble() {
        return myDouble;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public URI getUri() {
        return uri;
    }

    public File getFile() {
        return file;
    }
}
