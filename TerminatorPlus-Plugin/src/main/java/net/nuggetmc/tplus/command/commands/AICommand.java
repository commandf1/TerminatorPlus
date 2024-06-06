@Command(
    name = "saveai",
    desc = "Save the current AI data."
)
public void saveAI(CommandSender sender) {
    saveData();
    sender.sendMessage(ChatColor.GREEN + "AI data saved successfully.");
}

@Command(
    name = "loadai",
    desc = "Load the AI data."
public void loadAI(CommandSender sender) {
    loadData();
    sender.sendMessage(ChatColor.GREEN + "AI data loaded successfully.");
}
