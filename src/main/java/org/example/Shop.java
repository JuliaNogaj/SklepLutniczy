package org.example;



import java.util.*;

public class Shop
{
    // Lista instrumentow, typow i wielosci

    private List<Instrument> instruments= new ArrayList<>();
    private Set<String> types= new HashSet<>();
    private Map<Integer,Instrument>sizeInstrument= new HashMap<>();

    // Chce pobrac wiec scanner
    Scanner scanner= new Scanner(System.in);

    // Metoda ktora dodaje instrumenty do listy
    // Dalam void bo ona nic nie zwraca ma tylko dodawac
    public void addInstrument()
    {
System.out.println("Podaj nazwe instrumentu");
String name= scanner.nextLine();

System.out.println("Podaj typ instrumentu");
String type= scanner.nextLine();

System.out.println("Podaj wielkosc instrumentu");
int size=Integer.valueOf(scanner.nextLine());

System.out.println("Czy to instrument lutniczy");
String isViolinMakerString=scanner.nextLine();
boolean isViolinMaker;
if(isViolinMakerString.equals("Y"))
{
isViolinMaker=true;

} else

        {
          isViolinMaker=false;

        }

// Tworze obiekt klasy instruments
        Instrument instrument=new Instrument(name,type,size,isViolinMaker);

instruments.add(instrument);
types.add(type);
sizeInstrument.put(size,instrument);




    }

    // Metoda, ktora wyswietli typy
    public void displayTypes()
    {
     for(String type:types)
     {
System.out.println(type);

     }

    }

// metoda, ktora wyszuka instrumenty po rozmiarze

    public void displaySize()
    {
        System.out.println("Podaj rozmiar instrumentu");
        Integer size = Integer.valueOf(scanner.nextLine());
       sizeInstrument.get(size);
       Instrument instrument = sizeInstrument.get(size);

       instrument.displayInstrumentInformation();

    }

    // metoda ktora zwraca liste instrumentow

    public void displayInstrument()
    {
    for(Instrument instrument:instruments)
        {
           instrument.displayInstrumentInformation();

        }


    }


}
