package com.javarush.test.level19.lesson10.bonus02;

/* Свой FileWriter
Реализовать логику FileConsoleWriter
Должен наследоваться от FileWriter
При записи данных в файл, должен дублировать эти данные на консоль
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter extends FileWriter {

    public FileConsoleWriter(String fileName) throws IOException {
        super(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        super(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        super(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        super(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        super(fd);
    }

    private char[] writeBuffer;
    private final int writeBufferSize = 1024;

    @Override
    public void write(int var1) throws IOException {
        if (writeBuffer == null){
            writeBuffer = new char[writeBufferSize];
        }
        writeBuffer[0] = (char) var1;
        write(writeBuffer, 0, 1);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.println(String.valueOf(cbuf).substring(off, off+len));
        super.write(cbuf, off, len);
    }

    @Override
    public void write(String var1, int var2, int var3) throws IOException {
        char[] var4 = new char[var3];
        var1.getChars(var2, var2 + var3, var4, 0);
        write((char[])var4, 0, var3);
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        write(cbuf, 0, cbuf.length);
    }

    @Override
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }


}
