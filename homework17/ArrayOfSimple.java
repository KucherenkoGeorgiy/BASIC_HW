package com.hillel.kucherenko.homework17;

public class ArrayOfSimple {
    int rangeForSearch;
    int quantityOfArrays;

    public ArrayOfSimple(int rangeForSearch, int quantityOfArrays) {
        this.rangeForSearch = rangeForSearch;
        this.quantityOfArrays = quantityOfArrays;
    }

    public void makeThreads(){
        int rangeOfSubarray = rangeForSearch / quantityOfArrays;// кол-во элементов в суб-массиве

        for (int i = 0; i < rangeForSearch; i+=rangeOfSubarray) {
            System.out.println(i + " till " + (i + rangeOfSubarray));

        }






    }

    public int[] getDifferentArrays(){

        return new int[]{};
    }




}
