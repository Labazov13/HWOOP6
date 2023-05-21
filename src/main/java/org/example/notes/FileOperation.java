package org.example.notes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FileOperation {

    public List<String> readAllLines();
    public void saveAllLines(List<String> lines);
    public void deleteLine(String note) throws IOException;
}
