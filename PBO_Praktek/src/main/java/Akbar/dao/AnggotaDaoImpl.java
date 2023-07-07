/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar.dao;
import java.util.List;
import Akbar.model.Anggota;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class AnggotaDaoImpl implements AnggotaDao{
    private List<Anggota> data = new ArrayList<>();
    
        public AnggotaDaoImpl(){
            data.add(new Anggota ("001","Azzammil","Lintau","L"));
            data.add(new Anggota ("002","Akbar","Lintau","L"));
            data.add(new Anggota ("003","Ramadhan","Lintau","L"));
        }
        
        public   void insert(Anggota anggota) {
           data.add(anggota);
       }
       
        public   void update(int index, Anggota anggota){
            data.set(index, anggota);
        }
        
        public   void delete(int index){
            data.remove(index);
        }
        
        public   Anggota getAnggota(int index){
            return data.get(index);
        }
        
        public   List <Anggota>getAll(){
            return data;
        }
}
