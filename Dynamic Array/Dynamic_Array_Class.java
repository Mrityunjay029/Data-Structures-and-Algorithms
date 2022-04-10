package com.company;

import java.util.Scanner;

public class Dynamic_Array_Class {

    int arr[];
    int index;
    int arr_size = arr.length;
    Dynamic_Array_Class(int length){
        arr = new int[length];
        index = 0;
    }
    public void insert(int item){
        int arr1[];
        if(index == arr.length){
            arr1 = new int[arr.length*2];
            arr1[index] = item;
            index++;
            arr = arr1;
        }
        else{
            arr[index] = item;
            index++;
        }
    }
    public void remove(int index){
        if(index != arr.length-1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
        arr_size--;
        int arr2[];
        arr2 = new int[arr_size];
        for(int i=0;i<arr_size;++)
            arr2[i] = arr[i];
        arr = arr2;
    }

    public void display(){
        for(int i =0;i<arr_size;i++){
            System.out.println(arr[i]);
        }
    }
}
