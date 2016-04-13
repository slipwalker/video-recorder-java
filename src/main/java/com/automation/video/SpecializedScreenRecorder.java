package com.automation.video;

import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by sergey on 13.04.16.
 */
public class SpecializedScreenRecorder extends ScreenRecorder {
    public SpecializedScreenRecorder(GraphicsConfiguration cfg, Format fileFormat, Format screenFormat, Format mouseFormat, Format audioFormat) throws IOException, AWTException {
        super(cfg, fileFormat, screenFormat, mouseFormat, audioFormat);
    }

    @Override
    public File createMovieFile(Format fileFormat) throws IOException {
        if (!movieFolder.exists()) {
            movieFolder.mkdirs();
        } else if (!movieFolder.isDirectory()) {
            throw new IOException("\"" + movieFolder + "\" is not a directory.");
        }

    }

    public void setMovieFolder(File movieFolder) {
        this.movieFolder = movieFolder;
    }
}
