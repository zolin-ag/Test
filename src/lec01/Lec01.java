package lec01;

//lec01.Lec01

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Lec01 {

    public static void main(String[] args) throws Exception {
        Lec01 ob = new Lec01();
        try{
            ob.m1();
            return;
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Выход за рамки");
        }catch(Exception ex){
            System.out.println(""+ex.getMessage());
        }finally{
            System.out.println("!!!!!!!!!!!!");
        }
        //....
    }
    
    void m1() throws Exception {
        m2();
    }
    
    void m2() throws Exception{
            int[] arr = new int[10];
            arr[1000] = 22;
            throw new Exception("Ой ошибка!");                
    }
}
