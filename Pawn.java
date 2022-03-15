import java.util.LinkedList;

public class Pawn extends Piece {
    
    public Pawn(){
        
    }
    
    public void move(int n){//n étant le nombre de cases devant n = 1 ou 2
        if(color){
            this.position+=10*n;
        }else{
            this.position-=10*n;
        }
        
    }
    
    public void remove(int n){
        if(color){
            this.position-=10*n;
        }else{
            this.position+=10*n;
        }
    }
    
    public LinkedList<Integer> searchMoves(Board board){
        if(color){
            for(int i ; i<2 ; i++){
                int nposition = this.position+i*10;
                if (nposition==0){
                    
                }
            }
        }
    }
}
