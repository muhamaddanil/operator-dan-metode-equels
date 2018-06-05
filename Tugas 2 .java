/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author danil
 */
public class Tugas2 {
    public static void main(String[] args) {
        String st1="saya suka makan bakso";
        String st2 ="saya suka makan bakso";
        String st3 ="saya suka ";
        String st4 ="makan ";
        String st5 ="bakso";
        String st6 =st3+st4+st5;
        System.out.println("statement 1 : "+ st1);
        System.out.println("statement 2 : "+ st2);
        System.out.println("statement 3 : "+ st3);
        System.out.println("statement 4 : "+ st4);
        System.out.println("statement 5 : "+ st5);
        System.out.println("statement 6 : "+ st6);
        System.out.println("Membandingan dengan Operator ==");
        System.out.println("statement 1 == statement 2 : "+ (st1==st2));
        System.out.println("statement 6 == statement 1 : "+ (st6==st1));
        System.out.println("statement 6 == statement 2 : "+ (st6==st2));
        System.out.println("Membandingan dengan Metode equal");
        System.out.println("statement1.equal(statement2): "+(st1.equals(st2)));
        System.out.println("statement6.equal(statement1): "+(st6.equals(st1)));
        System.out.println("statement6.equal(statement2): "+(st6.equals(st2)));
        System.out.println("jadi kesimpulannya perbandingan menggunakan operator == hanya true pada statement 1 banding statement 2 selain itu false");
        System.out.println("sementara pada metode equel semuanya true");
    }
}
