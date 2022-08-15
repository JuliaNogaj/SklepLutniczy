package org.example;

public class Instrument

{
private String name;
private String type;
private int size;
private boolean isViolinMaker;


//Konstruktor
     public Instrument(String name,String type,int size, boolean isViolinMaker)
     {
         this.name=name;
         this.type=type;
         this.size=size;
         this.isViolinMaker=isViolinMaker;

     }

     // Pobieramy informacje o naszym instrumencie czyli getery

    public String getName()
    {
        return name;

    }

    public String getType()
    {
        return type;

    }
    public int getSize()
    {
        return size;

    }

      public  boolean isViolinMaker()
      {
          return isViolinMaker;

      }
public void displayInstrumentInformation()
{
    System.out.println("Nazwa" + name);
    System.out.println("Nazwa" + type);
    System.out.println("Nazwa" + size);
    System.out.println("Nazwa" + isViolinMaker);


}

}
