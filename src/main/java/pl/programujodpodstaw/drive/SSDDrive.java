package pl.programujodpodstaw.drive;

import pl.programujodpodstaw.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSDDrive implements Drive {

    Map<String, File> files = new HashMap<>();
    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFiles() {
        Set<String> fileNames = files.keySet();
        for (String fileName: fileNames){
            System.out.println(fileName);
        }
    }
}
