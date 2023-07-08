
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("A",50,"BATU BOZ",2000));
        list.add(new Book("B",70,"YAHYA",2000));
        list.add(new Book("C",300,"REIS",2000));
        list.add(new Book("D",400,"APO",2000));
        list.add(new Book("G",500,"OKAN",2000));
        list.add(new Book("K",600,"BATU BOZ",2000));
        list.add(new Book("F",700, "RECO",2000));
        list.add(new Book("L",800,"RESUL",2000));
        list.add(new Book("M",900,"EMIR",2000));
        list.add(new Book("N",1000,"SAMSUNLU FAIK",2000));
        /*Map<String,String> mapList = new TreeMap<>();

        list.stream().forEach(book -> mapList.put(book.getBookName(),book.getAuthor()));
        System.out.println("-----ALL AUTHORS AND BOOKS-----");
        for(String name:mapList.keySet()){
                System.out.println(name + " - " + mapList.get(name));
        }
        System.out.println();*/

        System.out.println("------BOOKS ARE GRATER THAN 100 PAGE-------");
        Map<String,String> mapList = new TreeMap<>();
        list.stream().filter(book -> book.getPageNumber()>100).forEach(book -> mapList.put(book.getBookName(), book.getAuthor()));
        mapList.forEach((name,author) -> System.out.println("BOOK NAME : "+name+" AUTHOR NAME : "+author));


    }
}
