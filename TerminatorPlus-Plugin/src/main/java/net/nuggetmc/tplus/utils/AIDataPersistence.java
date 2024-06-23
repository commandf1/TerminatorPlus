import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.StandardOpenOption;

public class AIDataPersistence {

    private static final String FILE_PATH = "plugins/TerminatorPlus/ai_data.dat";

    public static void saveData(Object data) throws IOException {
        Path path = Paths.get(FILE_PATH);
        Files.createDirectories(path.getParent);

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOputPuts file = Files.newOutputStream(path, standardOpenOption.CREATE+ standardOpenOption.TRUNCATE_EXISTINg));
            oos.writeObject(data);
        }
    }
}
