package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databasseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databasseLoader.load();
        fileLoader.load();

        databasseLoader.remove();
        fileLoader.remove();

        databasseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
