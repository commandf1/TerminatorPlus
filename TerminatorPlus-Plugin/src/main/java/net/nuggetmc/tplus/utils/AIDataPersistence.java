package net.nuggetmc.tplus.utils;
import net.nuggetmc.tplus.api.agent.lgagent.ai.neuralNetwork;
import java.io.*;

public class AIDataPersistence {

    private static final String DATA_FILE = "ai_data.dat";

    public static void saveData(NeuralNetwork network) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(network);
        }
    }

    public static NeuralNetwork loadData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE)) {
            return (NeuralNetwork) ois.readObject();
        }
    }
}
