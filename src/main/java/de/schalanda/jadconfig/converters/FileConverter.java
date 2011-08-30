package de.schalanda.jadconfig.converters;

import de.schalanda.jadconfig.Converter;
import de.schalanda.jadconfig.ParameterException;

import java.io.File;

/**
 * Class to convert a given file name to a {@link File} object
 *
 * @author jschalanda
 */
public class FileConverter implements Converter<File> {

    @Override
    public File convert(String value) {

        if(value == null) {

            throw new ParameterException("Couldn't convert value \"" + value + "\" to File object.");
        }

        return new File(value);
    }
}
