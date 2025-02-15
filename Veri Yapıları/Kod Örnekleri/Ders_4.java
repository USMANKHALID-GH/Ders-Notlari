/**
 *
 * @author Ahmet
 */

class stack{
    private int [] dizi;
    private int boyut, ustDeger;

    public stack(int boyut) {
        this.boyut = boyut;
        this.dizi = new int[this.boyut];
        this.ustDeger = -1;
    }
    
    public Boolean isFull(){
        return ustDeger == boyut-1;
    }
    
    public Boolean isEmpty(){
        return ustDeger == -1;
    }
    
    public void push(int sayi){
        if(!isFull()){
            ustDeger++;
            dizi[ustDeger] = sayi;
        }
        else{
            System.out.println("Stack/Yığıt dolu!");
        }
    }
    
    public int pop(){
        if(!isEmpty()){
            int tmpSilinen = dizi[ustDeger];
            ustDeger--;
            return tmpSilinen;
        }
        else{
            return -1; // Stack boş ise return -1
        }
    }
    
    public int top(){
        if(!isEmpty()){
            return dizi[ustDeger];
        }
        else {
            return -1;
        }
    }
    
    public void listele(){
        int i = ustDeger;
        if(!isEmpty()){
            while(i != -1){
                System.out.println(dizi[i]);
                i--;
            }
        }
        else{
            System.out.println("Stack/Yığıt boş");
        }
    }
    
}

public class Stack_Yigit_Cikin {

    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(3);
        s.push(5);
        s.push(4);
        s.push(1);
        s.listele();
    }
}
