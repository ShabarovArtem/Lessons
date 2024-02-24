package enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
    System.out.println(Arrays.toString(Country.values()));
    }
    public static CountryOld[] getCountries(){
        CountryOld[] countries = new CountryOld[3];
        countries[0] = new CountryOld("Япония",140_000_00l,"японский");
        countries[1] = new CountryOld("Греция",10_000_00l,"японский");
        countries[2] = new CountryOld("Аргентина",57_000_00l,"японский");
        return countries;
    }

}
