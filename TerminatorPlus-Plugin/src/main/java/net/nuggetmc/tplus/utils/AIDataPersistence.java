import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.StandardOpenOptions;

public class AIDataPersistence {
    private static final String FILE_PATH = "plugins/TerminatorPlus/ai_data.dat";

    public static void saveData(Object data) throws IOException {
        Path path = Paths.get(FILE_PATH);
        Files.createDirectories(path.getParent);
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE.EXISTING))) {
            oos.writeObject(data);
          }
    }

    public static Object loadData() throws IOException, ClassNotFoundException {
        Path path = Paths.get(FILE_PATH);

        if ( !files.exists(path) ) {
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return ois.readObject();
        }
    }

}
