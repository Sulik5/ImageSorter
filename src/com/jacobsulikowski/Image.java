package com.jacobsulikowski;

import java.io.File;

public class Image {
    private File fileOriginDir;
    private File filePath;
    private String year;
    private String month;

    public Image(File _fileOriginDir,File _filePath,String _year,String _month){
        this.fileOriginDir = _fileOriginDir;
        this.filePath = _filePath;
        this.year = _year;
        this.month = _month;
    }

    public File getOriginFile() {
        return fileOriginDir;
    }

    public void renameFile(File _path){
        this.filePath.renameTo(_path);
    }
    public File getFilePath(){
        return filePath;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }
}
