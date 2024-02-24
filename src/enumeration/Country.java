package enumeration;

public enum Country {
    JAPAN("Япония",140_000_00l,"Японский"),
    GREECE("Греция",10_000_00l,"японский"),
    ARGENTINA("Аргентина",57_000_00l,"японский");
    private String name;
    private long propleCount;
    private String language;

    Country(String name, long propleCount, String language) {
        this.name = name;
        this.propleCount = propleCount;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", propleCount=" + propleCount +
                ", language='" + language + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getPropleCount() {
        return propleCount;
    }

    public String getLanguage() {
        return language;
    }
}
