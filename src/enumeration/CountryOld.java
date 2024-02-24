package enumeration;

public class CountryOld {
    private String name;
    private long propleCount;
    private String language;

    public CountryOld(String name, long propleCount, String language) {
        this.name = name;
        this.propleCount = propleCount;
        this.language = language;
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
