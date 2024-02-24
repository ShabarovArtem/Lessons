package nested_classes;

public class Human {
    private Passport passport;
    private Heart heart;
    public Human(String series, String number, PassportTypenumber passportType) {
        this.passport = new Passport(series, number,passportType );
        this.heart = new Heart(285.0);
    }

    public static class Passport{
        private String series;
        private String number;
        private  PassportTypenumber passportType;

        public Passport(String series, String number, PassportTypenumber passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passportType=" + passportType +
                    '}';
        }
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "passport=" + passport +
                ", heart=" + heart +
                '}';
    }

    public class Heart {
        private double weight;

        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    '}';
        }

        public Heart(double weight) {
            this.weight = weight;
        }

    }
}
