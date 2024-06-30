    public static Object loadData() throws IOException, ClassNotFoundException {
        Path path = Paths.get(FILE_PATH);

        if (!Files.exists(path)) {
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            return ois.readObject();
        }
    }
}
}
