    @Command(
            name = "info",
            desc = "Display neural network information about a bot.",
            autofill = "infoAutofill"
    )
    public void info(CommandSender sender, @Arg("name") String name) {
        //Method to display neural network info
    }

    @Override
    public void clearSession() {
        if (agent != null) {
            agent.stop();
            agent = null;
        }
    }

    public boolean hasActiveSession() {
        return agent != null;
    }
}