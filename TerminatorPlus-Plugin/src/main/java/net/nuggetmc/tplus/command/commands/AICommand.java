import net.nuggetmc.tplus.utils.AIDataPersistence;
import java.io.IOException;


@Override
public void saveData() {
    try {
        AIDataPersistence.saveData(agent.getNeuralNetwork());
        plugin.getLogger().info("AI data saved successfully.");
    } catch (IOException e) {
        plugin.getLogger().severe("Failed to save AI data: " + e.getMessage());
    }
}

  @override
public void loadData() {
    try {
        NeuralNetwork network = AIDataPersistence.loadData();
        this.agent.setNeuralNetwork(network);
        plugin.getLogger().info("AI data loaded successfully.");
    } catch (IOException | ClassNotFoundException e) {
        plugin.getLogger().severe("Failed to load AI data: " + e.getMessage());
    }
}
