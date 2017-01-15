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
    static void genSlownik() {
        for (int i = 0; i < slownikOpis.length; i++) {
            System.out.println("EXEC dodajNowyTypWarsztatu '" + slownikTemat[i] + "','" + slownikOpis[i] + "'");
        }
    }

    static void genKonf() {
        Random rand = new Random();
        int index = 0;
        System.out.println("DECLARE @tmp int");
        for (int i = 0; i < 3; i++) {// rok
            for (int j = 1; j <= 12; j++) {// miesiac
                for (int k = 0; k < 2; k++) {// ile w miesiacu
                    int rok = 2017 + i;
                    int dzien = 1 + rand.nextInt(26);
                    int godz = 12 + rand.nextInt(5);
                    String data = dajDate(rok, j, dzien, godz);
                    int cena = (1 + rand.nextInt(5)) * 50;
                    int miejsca = 170 + rand.nextInt(10) * 10;
                    int znizkaStudencka = (rand.nextBoolean()) ? rand.nextInt(10) * 5 : 0;
                    int dniKonf = rand.nextInt(3) + 1;
                    System.out.println("EXEC utworzKonferencje '" + temat[index++] + "'," + data + "," + cena + ","
                            + miejsca + ",0." + znizkaStudencka + "," + dniKonf);
                    System.out.println(
                            "SELECT TOP 1 @tmp=idKonferencja FROM dzieńKonferencji ORDER BY idKonferencja DESC");
                    genWarsztat(rok, j, dzien, godz, dniKonf);
                }
            }
        }
    }

    private static String dajDate(int rok, int mies, int dzien, int godz) {
        return new String("'" + rok + '-' + mies + '-' + dzien + ' ' + godz + ":00:00'");

    }

    private static void genWarsztat(int rok,int mies,int dzien, int godz, int dniKonf) {
        Random rand = new Random();
        for(int i=0;i<dniKonf;i++){
            for(int j=0;j<4;j++){
                int czasRozp=godz+rand.nextInt(5);
                int czasZak=czasRozp+1+rand.nextInt(3);
                int liczbaMiejsc=rand.nextInt(20)+15;
                int cena=(rand.nextBoolean())?0:(1+rand.nextInt(10))*20;
                System.out.println("EXEC dodajWarsztat @tmp,"+i+","+dajDate(rok, mies, dzien+i,czasRozp )+","+dajDate(rok, mies, dzien+i,czasZak)+","+liczbaMiejsc+","+cena+","+(1010+rand.nextInt(20)));
            }
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

    static String temat[] = { "conversation", "love", "initiative", "family", "university", "opinion", "soup", "wife",
            "proposal", "bonus", "woman", "video", "indication", "instruction", "election", "drawer", "improvement",
            "classroom", "growth", "apartment", "girlfriend", "baseball", "explanation", "department", "sister", "role",
            "procedure", "child", "moment", "mood", "meat", "son", "arrival", "passenger", "payment", "criticism",
            "environment", "hat", "breath", "office", "expression", "director", "organization", "poem", "mixture",
            "relationship", "chemistry", "grocery", "decision", "reception", "performance", "construction", "marriage",
            "city", "editor", "tongue", "preference", "contribution", "comparison", "statement", "definition", "wood",
            "safety", "bath", "employee", "property", "menu", "assistant", "temperature", "hospital", "hotel",
            "concept", };

    static String[] slownikTemat = { "personality", "region", "construction", "control", "article", "situation",
            "category", "chest", "scene", "university", "meat", "elevator", "way", "bread", "policy", "user", "drawing",
            "success", "aspect", "piano", "development", "procedure", "midnight", "buyer", "direction", "professor",
            "appearance", "health", "impression", "garbage" };
    static String[] slownikOpis = { "Good servicing requires a lot of effort; tip them!",
            "We all need help sometimes; offer someone a helping hand", "Surprise your parents with flowers",
            "Forgive someone who has wronged you", "Share something interesting you’ve learnt today",
            "Save water – take a shorter shower today", "Save your family some time and buy their groceries",
            "Go the day without complaining", "Make an effort to get to know someone you don’t usually talk to",
            "Read a good book recently? Pass it on to someone else", "Purchase ethical goods",
            "Start the day right – make breakfast for everyone", "House chores can be tiring – offer a helping hand",
            "Is that litter on the floor? Pick it up and bin it", "Help somebody with a chore they need done!",
            "It’s hard to stay connected – reach out to an elderly person you know",
            "Neighbour’s lawn looking messy? Offer to mow it",
            "Make your voice count - sign a petition for a good cause",
            "Remember that friend you haven’t seen for ages? Give them a call", "Leave someone flowers anonymously",
            "Have lunch with a homeless person", "Feeling brave? Give blood",
            "It can get lonely when you are old, pay your grandparents a visit", "Go green – don’t waste paper",
            "No matter how annoying they can be, tell your siblings how much you appreciate them",
            "Put your phone down and have a conversation with a friend", "Plant a seed",
            "Help a younger student with their work", "Make a conscious effort to recycle",
            "Make someone a cup of coffee", };
}
