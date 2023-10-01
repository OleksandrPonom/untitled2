package mod_10.Task_1;

import java.io.*;
import java.nio.charset.Charset;

public class PhoneRead extends FileReader {
    public PhoneRead(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public PhoneRead(File file) throws FileNotFoundException {
        super(file);
    }

    public PhoneRead(FileDescriptor fd) {
        super(fd);
    }

    public PhoneRead(String fileName, Charset charset) throws IOException {
        super(fileName, charset);
    }

    public PhoneRead(File file, Charset charset) throws IOException {
        super(file, charset);
    }
}
