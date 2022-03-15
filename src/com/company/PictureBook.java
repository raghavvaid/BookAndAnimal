package com.company;

public class PictureBook extends Book{
    private String illustrator;

    public PictureBook(String t, String a, String ill){
        super(t, a);
        illustrator = ill;
    }
    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }


}
