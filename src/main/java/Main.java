import java.util.Random;

/**
 * Created by Lenovo on 2017-01-15.
 */
public class Main {
    public static void main(String [] args){
        generateCompanies();
    }



    public static void generateBookings(){
        for (int i = 0; i < 1000; i++) {

        }
    }



    public static void generateCompanies(){
        Random random = new Random();
        Integer j,z;
        for (int i = 0; i < 2 * companies.length; i++) {
            j = random.nextInt(companies.length);
            z = random.nextInt();
            int index = names[j].indexOf(' ');
            System.out.println("EXEC dbo.dodajKlienta '" + companies[j] + random.nextInt(500) + "@email.com', '" +
                    random.nextInt(1000000000) + "', '" + cities[random.nextInt(cities.length)]
                    + "', 'Polska', "  + "'Główna " + random.nextInt(1000) +
                    "', '0', '0', " + " '" + companies[j] + "' , 1");
        }
    }
    public static void generateCustomers(){
        Random random = new Random();
        Integer j,z;
        for (int i = 0; i < 1000; i++) {
            j = random.nextInt(100);
            z = random.nextInt();
            int index = names[j].indexOf(' ');
            System.out.println("EXEC dbo.dodajKlienta '" + names[j].substring(0,index)  +
                    names[j].substring(index + 1) + random.nextInt(500) + "@email.com', '" +
                    random.nextInt(1000000000) + "', '" + cities[random.nextInt(cities.length)]
                     + "', 'Polska', "  + "'Główna " + random.nextInt(1000) + "', '" + names[j].substring(0,index) +
                    "', '" + names[j].substring(index + 1) + "', 0, 0");
        }
    }

    public static void generateCities(){
        for (int i = 0; i < cities.length; i++) {
            System.out.println("EXEC dbo.dodajMiasto " + cities[i] + " Polska");
        }
    }
    public static String [] companies = {
            "Dingdinlex",
            "Canemedia",
            "E-taxon",
            "Continron",
            "Flexware",
            "Indigoity",
            "Solotechno",
            "fase-kix",
            "Jobcorporation",
            "Plexway",
            "Lanetrax",
            "Villadrill",
            "Zoomsuntam",
            "Roncity",
            "Groovelane",
            "Vila-is",
            "Zathdamla",
            "singletechnology",
            "Dingholding",
            "Ladex",
            "Unizap",
            "jay-ing",
            "xxx-bam",
            "Zamzim",
            "Sunkeytech",
            "Latvivacane",
            "Labqvoice",
            "Conehouse",
            "K-planet",
            "Overstreet",
            "Solokaylab",
            "Mediacane",
            "Openfind",
            "Haybase",
            "Kanphase",
            "Faseline",
            "Konzoom",
            "coneway",
            "Ganzcare",
            "Ranksanjob",
            "Triokeytex",
            "Codecare",
            "Cantechnology",
            "Lattax",
            "Howtabam",
            "Roundtom",
            "Isace",
            "Matzap",
            "Dinghouse",
            "Labace",
            "Tamplax",
            "Tampflex",
            "Conjoydex",
    };
    public static String [] cities = {"Warszawa", "Łódź", "Kraków", "Gdańsk", "Wrocław", "Poznań", "Szczecin", "Bydgoszcz", "Lublin",
            "Katowice", "Białystok", "Gdynia", "Częstochowa", "Radom", "Sosnowiec", "Toruń", "Kielce", "Rzeszów", "Gliwice",
            "Olsztyn", "Bielsko-Biała", "Bytom", "Zabrze", "Rybnik"};

    public static String[] names = {"Paulina Sobczak",
            "Henryk Bąk",
            "Kazimierz Górski",
            "Irena Wójcik",
            "Marian Chmielewski",
            "Małgorzata Jaworska",
            "Ewa Duda",
            "Jakub Malinowski",
            "Jadwiga Brzezińska",
            "Roman Sawicki",
            "Marcin Szymczak",
            "Joanna Baranowska",
            "Maciej Szczepański",
            "Czesław Wróbel",
            "Grażyna Górska",
            "Wanda Krawczyk",
            "Renata Urbańska",
            "Wiesława Tomaszewska",
            "Bożena Baranowska",
            "Ewelina Malinowska",
            "Anna Krajewska",
            "Mieczysław Zając",
            "Wiesław Przybylski",
            "Dorota Tomaszewska",
            "Jerzy Wróblewski",
            "Magdalena Adamczyk",
            "Władysław Piotrowski",
            "Marek Wiśniewski",
            "Stanisława Głowacka",
            "Agata Kubiak",
            "Marian Kowalski",
            "Piotr Szymański",
            "Stanisław Kowalski",
            "Aleksandra Szulc",
            "Tomasz Kucharski",
            "Marcin Mazurek",
            "Sebastian Baranowski",
            "Agata Wysocka",
            "Grażyna Mazur",
            "Marcin Gajewski",
            "Krystyna Sikorska",
            "Krzysztof Kowalski",
            "Małgorzata Mazurek",
            "Adam Jasiński",
            "Patrycja Makowska",
            "Piotr Adamczyk",
            "Waldemar Wieczorek",
            "Edward Szulc",
            "Janusz Andrzejewski",
            "Edyta Nowakowska",
            "Joanna Woźniak",
            "Mateusz Michalak",
            "Marta Sobczak",
            "Waldemar Makowski",
            "Marzena Jabłońska",
            "Maciej Sikora",
            "Monika Szewczyk",
            "Genowefa Cieślak",
            "Edyta Nowicka",
            "Piotr Malinowski",
            "Krzysztof Głowacki",
            "Andrzej Szewczyk",
            "Mariusz Grabowski",
            "Stefania Król",
            "Wiesław Szczepański",
            "Małgorzata Wasilewska",
            "Józef Szczepański",
            "Mariusz Kowalczyk",
            "Janina Kozłowska",
            "Roman Kwiatkowski",
            "Jadwiga Kamińska",
            "Agnieszka Zając",
            "Robert Włodarczyk",
            "Henryk Kowalski",
            "Kazimiera Zalewska",
            "Sylwia Kaźmierczak",
            "Dorota Maciejewska",
            "Jacek Laskowski",
            "Michał Sobczak",
            "Genowefa Lis",
            "Mirosław Czerwiński",
            "Agata Gajewska",
            "Zofia Bąk",
            "Marek Adamczyk",
            "Agata Pawlak",
            "Adam Jankowski",
            "Mieczysław Adamczyk",
            "Wanda Czarnecka",
            "Andrzej Ziółkowski",
            "Jarosław Laskowski",
            "Iwona Urbańska",
            "Aneta Jakubowska",
            "Zdzisław Król",
            "Maria Wiśniewska",
            "Grzegorz Borkowski",
            "Maria Głowacka",
            "Jakub Pietrzak",
            "Danuta Piotrowska",
            "Sebastian Chmielewski",
            "Adam Andrzejewski"};
}
